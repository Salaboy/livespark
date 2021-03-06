/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.appformer.formmodeler.codegen.view.impl.html.inputs;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.kie.workbench.common.forms.model.impl.basic.image.PictureFieldDefinition;
import org.kie.workbench.common.forms.service.FieldManager;

@Dependent
public class PictureTemplateProvider extends AbstractTemplateProvider {

    @Inject
    public PictureTemplateProvider( final FieldManager fieldManager ) {
        super( fieldManager );
    }

    @Override
    protected String[] getSupportedFieldCodes() {
        return new String[]{ PictureFieldDefinition.CODE };
    }

    @Override
    protected String getTemplateForFieldTypeCode( final String fieldCode ) {
        return "/org/kie/appformer/formmodeler/codegen/view/impl/html/templates/picture.mv";
    }
}
