// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InputSetInputSetImportRequest {
    /**
     * @return Description of the input set.
     * 
     */
    private @Nullable String inputSetDescription;
    /**
     * @return Name of the input set.
     * 
     */
    private @Nullable String inputSetName;

    private InputSetInputSetImportRequest() {}
    /**
     * @return Description of the input set.
     * 
     */
    public Optional<String> inputSetDescription() {
        return Optional.ofNullable(this.inputSetDescription);
    }
    /**
     * @return Name of the input set.
     * 
     */
    public Optional<String> inputSetName() {
        return Optional.ofNullable(this.inputSetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputSetInputSetImportRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String inputSetDescription;
        private @Nullable String inputSetName;
        public Builder() {}
        public Builder(InputSetInputSetImportRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputSetDescription = defaults.inputSetDescription;
    	      this.inputSetName = defaults.inputSetName;
        }

        @CustomType.Setter
        public Builder inputSetDescription(@Nullable String inputSetDescription) {

            this.inputSetDescription = inputSetDescription;
            return this;
        }
        @CustomType.Setter
        public Builder inputSetName(@Nullable String inputSetName) {

            this.inputSetName = inputSetName;
            return this;
        }
        public InputSetInputSetImportRequest build() {
            final var _resultValue = new InputSetInputSetImportRequest();
            _resultValue.inputSetDescription = inputSetDescription;
            _resultValue.inputSetName = inputSetName;
            return _resultValue;
        }
    }
}