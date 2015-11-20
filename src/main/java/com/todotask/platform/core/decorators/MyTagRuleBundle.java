package com.todotask.platform.core.decorators;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.content.tagrules.html.ExportTagToContentRule;
import org.sitemesh.tagprocessor.State;

public class MyTagRuleBundle  implements TagRuleBundle{
    @Override
    public void install(State defaultState, ContentProperty contentProperty,
            SiteMeshContext siteMeshContext) {
        defaultState.addRule("myHeader", new ExportTagToContentRule(siteMeshContext, contentProperty.getChild("myHeader"), false));
        
    }
    
    @Override
    public void cleanUp(State defaultState, ContentProperty contentProperty,
            SiteMeshContext siteMeshContext) {
    }
}
