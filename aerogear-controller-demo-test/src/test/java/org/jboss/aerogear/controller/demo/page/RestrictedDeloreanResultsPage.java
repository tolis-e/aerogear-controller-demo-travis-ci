/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.aerogear.controller.demo.page;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;

import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.openqa.selenium.WebElement;

/**
 * Represents the restricted delorean page
 * 
 * @author <a href="mailto:aemmanou@redhat.com">Tolis Emmanouilidis</a>
 * 
 */
public class RestrictedDeloreanResultsPage extends ResultsPage {

    /**
     * The heading title for the restricted page.
     */
    private static final String restrictedPageHeadingTitle = "Restricted page";

    /**
     * Locator for the restricted delorean link.
     */
    @FindBy(jquery = "a[href=\"delorean\"]")
    private WebElement restrictedDeloreanPageLink;

    /**
     * The heading title for the results security error page.
     */
    private static final String securityErrorPageHeadingTitle = "Security error page";

    /**
     * Gets the heading title for the security error results page.
     * 
     * @return heading title
     */
    public String getSecurityErrorPageHeadingTitle() {
        return securityErrorPageHeadingTitle;
    }

    /**
     * Navigates to the restricted delorean page.
     */
    public void navigateToRestrictedDeloeanPage() {
        guardHttp(restrictedDeloreanPageLink).click();
    }

    /**
     * Gets the page heading title for the restricted page.
     * 
     * @return Page heading title.
     */
    public String getRestrictedPageHeadingTitle() {
        return restrictedPageHeadingTitle;
    }
}
