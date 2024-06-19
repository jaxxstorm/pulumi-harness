// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class UserGroupPermissionsAppPermissionsTemplate {
    /**
     * @return The actions allowed to be performed. Valid options are CREATE, READ, UPDATE, DELETE
     * 
     */
    private List<String> actions;
    /**
     * @return The application IDs to which the permission applies. Leave empty to apply to all applications.
     * 
     */
    private @Nullable List<String> appIds;
    /**
     * @return The template IDs to which the permission applies. Leave empty to apply to all environments.
     * 
     */
    private @Nullable List<String> templateIds;

    private UserGroupPermissionsAppPermissionsTemplate() {}
    /**
     * @return The actions allowed to be performed. Valid options are CREATE, READ, UPDATE, DELETE
     * 
     */
    public List<String> actions() {
        return this.actions;
    }
    /**
     * @return The application IDs to which the permission applies. Leave empty to apply to all applications.
     * 
     */
    public List<String> appIds() {
        return this.appIds == null ? List.of() : this.appIds;
    }
    /**
     * @return The template IDs to which the permission applies. Leave empty to apply to all environments.
     * 
     */
    public List<String> templateIds() {
        return this.templateIds == null ? List.of() : this.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupPermissionsAppPermissionsTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private @Nullable List<String> appIds;
        private @Nullable List<String> templateIds;
        public Builder() {}
        public Builder(UserGroupPermissionsAppPermissionsTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.appIds = defaults.appIds;
    	      this.templateIds = defaults.templateIds;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("UserGroupPermissionsAppPermissionsTemplate", "actions");
            }
            this.actions = actions;
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder appIds(@Nullable List<String> appIds) {

            this.appIds = appIds;
            return this;
        }
        public Builder appIds(String... appIds) {
            return appIds(List.of(appIds));
        }
        @CustomType.Setter
        public Builder templateIds(@Nullable List<String> templateIds) {

            this.templateIds = templateIds;
            return this;
        }
        public Builder templateIds(String... templateIds) {
            return templateIds(List.of(templateIds));
        }
        public UserGroupPermissionsAppPermissionsTemplate build() {
            final var _resultValue = new UserGroupPermissionsAppPermissionsTemplate();
            _resultValue.actions = actions;
            _resultValue.appIds = appIds;
            _resultValue.templateIds = templateIds;
            return _resultValue;
        }
    }
}
