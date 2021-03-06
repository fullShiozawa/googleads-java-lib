// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201306.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupPage;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.OrderBy;
import com.google.api.ads.adwords.axis.v201306.cm.Paging;
import com.google.api.ads.adwords.axis.v201306.cm.Predicate;
import com.google.api.ads.adwords.axis.v201306.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201306.cm.Selector;
import com.google.api.ads.adwords.axis.v201306.cm.SortOrder;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all ad groups in a campaign. To add an ad group, run
 * AddAdGroup.java. To get campaigns, run GetCampaigns.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupService.get
 *
 * @author Kevin Winter
 */
public class GetAdGroups {

  private static final int PAGE_SIZE = 100;

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    Long campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws Exception {
    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    int offset = 0;
    boolean morePages = true;

    // Create selector.
    Selector selector = new Selector();
    selector.setFields(new String[] {"Id", "Name"});
    selector.setOrdering(new OrderBy[] {new OrderBy("Name", SortOrder.ASCENDING)});
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    // Create predicates.
    Predicate campaignIdPredicate =
        new Predicate("CampaignId", PredicateOperator.IN, new String[] {campaignId.toString()});
    selector.setPredicates(new Predicate[] {campaignIdPredicate});

    while (morePages) {
      // Get all ad groups.
      AdGroupPage page = adGroupService.get(selector);

      // Display ad groups.
      if (page.getEntries() != null) {
        for (AdGroup adGroup : page.getEntries()) {
          System.out.println("Ad group with name \"" + adGroup.getName() + "\" and id \""
              + adGroup.getId() + "\" was found.");
        }
      } else {
        System.out.println("No ad groups were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
      morePages = offset < page.getTotalNumEntries();
    }
  }
}
