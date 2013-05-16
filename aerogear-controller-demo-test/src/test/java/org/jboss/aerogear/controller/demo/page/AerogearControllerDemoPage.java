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

import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.openqa.selenium.WebElement;

/**
 * A common structure for all the pages of the specific Aerogear-Controller-Demo example.
 * 
 * @author <a href="mailto:aemmanou@redhat.com">Tolis Emmanouilidis</a>
 * 
 */
public class AerogearControllerDemoPage {

    /**
     * Locator for the container div.
     */
    @FindBy(className = "container")
    private WebElement content;

    /**
     * Locator for the page header.
     */
    @FindBy(css = "h1.remove-bottom")
    private WebElement pageHeader;

    /**
     * Retrieves the heading title text.
     * 
     * @return The title text.
     */
    public String getHeadingTitle() {
        return pageHeader.getText();
    }

    /**
     * Waits until the page is loaded.
     */
    public void waitUntilPageIsLoaded() {
        Graphene.waitModel().until().element(content).is().present();
    }

}
