/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.keycloak.models.map.storage.jpa.user.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.keycloak.models.map.storage.jpa.JpaAttributeEntity;

/**
 * JPA implementation for user attributes. This entity represents a user attribute and has a many-to-one relationship
 * with the user entity.
 *
 * @author <a href="mailto:sguilhen@redhat.com">Stefan Guilhen</a>
 */
@Entity
@Table(name = "kc_user_attribute", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"fk_root", "name", "value"})
})
public class JpaUserAttributeEntity extends JpaAttributeEntity<JpaUserEntity> {

    public JpaUserAttributeEntity() {
    }

    public JpaUserAttributeEntity(final JpaUserEntity root, final String name, final String value) {
        super(root, name, value);
    }

}
