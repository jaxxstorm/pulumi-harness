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
public final class UserGroupPermissionsAppPermissionsDeployment {
    /**
     * @return The actions allowed to be performed. Valid options are READ, EXECUTE*WORKFLOW, EXECUTE*PIPELINE, ROLLBACK*WORKFLOW, ABORT*WORKFLOW
     * 
     */
    private List<String> actions;
    /**
     * @return The application IDs to which the permission applies. Leave empty to apply to all applications.
     * 
     */
    private @Nullable List<String> appIds;
    /**
     * @return The environment IDs to which the permission applies. Leave empty to apply to all environments.
     * 
     */
    private @Nullable List<String> envIds;
    /**
     * @return The filters to apply to the action. Valid options are: NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
     * 
     */
    private @Nullable List<String> filters;

    private UserGroupPermissionsAppPermissionsDeployment() {}
    /**
     * @return The actions allowed to be performed. Valid options are READ, EXECUTE*WORKFLOW, EXECUTE*PIPELINE, ROLLBACK*WORKFLOW, ABORT*WORKFLOW
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
     * @return The environment IDs to which the permission applies. Leave empty to apply to all environments.
     * 
     */
    public List<String> envIds() {
        return this.envIds == null ? List.of() : this.envIds;
    }
    /**
     * @return The filters to apply to the action. Valid options are: NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
     * 
     */
    public List<String> filters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupPermissionsAppPermissionsDeployment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private @Nullable List<String> appIds;
        private @Nullable List<String> envIds;
        private @Nullable List<String> filters;
        public Builder() {}
        public Builder(UserGroupPermissionsAppPermissionsDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.appIds = defaults.appIds;
    	      this.envIds = defaults.envIds;
    	      this.filters = defaults.filters;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("UserGroupPermissionsAppPermissionsDeployment", "actions");
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
        public Builder envIds(@Nullable List<String> envIds) {

            this.envIds = envIds;
            return this;
        }
        public Builder envIds(String... envIds) {
            return envIds(List.of(envIds));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<String> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }
        public UserGroupPermissionsAppPermissionsDeployment build() {
            final var _resultValue = new UserGroupPermissionsAppPermissionsDeployment();
            _resultValue.actions = actions;
            _resultValue.appIds = appIds;
            _resultValue.envIds = envIds;
            _resultValue.filters = filters;
            return _resultValue;
        }
    }
}
