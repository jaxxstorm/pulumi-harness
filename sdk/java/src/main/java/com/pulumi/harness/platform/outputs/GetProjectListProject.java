// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProjectListProject {
    private String identifier;
    private String name;

    private GetProjectListProject() {}
    public String identifier() {
        return this.identifier;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectListProject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String identifier;
        private String name;
        public Builder() {}
        public Builder(GetProjectListProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetProjectListProject", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetProjectListProject", "name");
            }
            this.name = name;
            return this;
        }
        public GetProjectListProject build() {
            final var _resultValue = new GetProjectListProject();
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
