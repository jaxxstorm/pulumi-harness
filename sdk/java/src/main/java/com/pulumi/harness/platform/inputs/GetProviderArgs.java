// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProviderArgs Empty = new GetProviderArgs();

    @Import(name="identifier", required=true)
    private Output<String> identifier;

    public Output<String> identifier() {
        return this.identifier;
    }

    private GetProviderArgs() {}

    private GetProviderArgs(GetProviderArgs $) {
        this.identifier = $.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderArgs $;

        public Builder() {
            $ = new GetProviderArgs();
        }

        public Builder(GetProviderArgs defaults) {
            $ = new GetProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public GetProviderArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetProviderArgs", "identifier");
            }
            return $;
        }
    }

}
