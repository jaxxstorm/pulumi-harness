// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceOverridesV2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceOverridesV2Args Empty = new GetServiceOverridesV2Args();

    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    @Import(name="envId", required=true)
    private Output<String> envId;

    public Output<String> envId() {
        return this.envId;
    }

    @Import(name="identifier", required=true)
    private Output<String> identifier;

    public Output<String> identifier() {
        return this.identifier;
    }

    @Import(name="infraId")
    private @Nullable Output<String> infraId;

    public Optional<Output<String>> infraId() {
        return Optional.ofNullable(this.infraId);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    @Import(name="spec", required=true)
    private Output<String> spec;

    public Output<String> spec() {
        return this.spec;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private GetServiceOverridesV2Args() {}

    private GetServiceOverridesV2Args(GetServiceOverridesV2Args $) {
        this.clusterId = $.clusterId;
        this.envId = $.envId;
        this.identifier = $.identifier;
        this.infraId = $.infraId;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.serviceId = $.serviceId;
        this.spec = $.spec;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceOverridesV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceOverridesV2Args $;

        public Builder() {
            $ = new GetServiceOverridesV2Args();
        }

        public Builder(GetServiceOverridesV2Args defaults) {
            $ = new GetServiceOverridesV2Args(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder envId(Output<String> envId) {
            $.envId = envId;
            return this;
        }

        public Builder envId(String envId) {
            return envId(Output.of(envId));
        }

        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder infraId(@Nullable Output<String> infraId) {
            $.infraId = infraId;
            return this;
        }

        public Builder infraId(String infraId) {
            return infraId(Output.of(infraId));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public Builder spec(Output<String> spec) {
            $.spec = spec;
            return this;
        }

        public Builder spec(String spec) {
            return spec(Output.of(spec));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetServiceOverridesV2Args build() {
            if ($.envId == null) {
                throw new MissingRequiredPropertyException("GetServiceOverridesV2Args", "envId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetServiceOverridesV2Args", "identifier");
            }
            if ($.spec == null) {
                throw new MissingRequiredPropertyException("GetServiceOverridesV2Args", "spec");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetServiceOverridesV2Args", "type");
            }
            return $;
        }
    }

}