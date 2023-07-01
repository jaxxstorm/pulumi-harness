// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ManualFreezeFreezeWindowRecurrenceRecurrenceSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManualFreezeFreezeWindowRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManualFreezeFreezeWindowRecurrenceArgs Empty = new ManualFreezeFreezeWindowRecurrenceArgs();

    @Import(name="recurrenceSpecs")
    private @Nullable Output<List<ManualFreezeFreezeWindowRecurrenceRecurrenceSpecArgs>> recurrenceSpecs;

    public Optional<Output<List<ManualFreezeFreezeWindowRecurrenceRecurrenceSpecArgs>>> recurrenceSpecs() {
        return Optional.ofNullable(this.recurrenceSpecs);
    }

    /**
     * Type of freeze
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of freeze
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ManualFreezeFreezeWindowRecurrenceArgs() {}

    private ManualFreezeFreezeWindowRecurrenceArgs(ManualFreezeFreezeWindowRecurrenceArgs $) {
        this.recurrenceSpecs = $.recurrenceSpecs;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManualFreezeFreezeWindowRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManualFreezeFreezeWindowRecurrenceArgs $;

        public Builder() {
            $ = new ManualFreezeFreezeWindowRecurrenceArgs();
        }

        public Builder(ManualFreezeFreezeWindowRecurrenceArgs defaults) {
            $ = new ManualFreezeFreezeWindowRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder recurrenceSpecs(@Nullable Output<List<ManualFreezeFreezeWindowRecurrenceRecurrenceSpecArgs>> recurrenceSpecs) {
            $.recurrenceSpecs = recurrenceSpecs;
            return this;
        }

        public Builder recurrenceSpecs(List<ManualFreezeFreezeWindowRecurrenceRecurrenceSpecArgs> recurrenceSpecs) {
            return recurrenceSpecs(Output.of(recurrenceSpecs));
        }

        public Builder recurrenceSpecs(ManualFreezeFreezeWindowRecurrenceRecurrenceSpecArgs... recurrenceSpecs) {
            return recurrenceSpecs(List.of(recurrenceSpecs));
        }

        /**
         * @param type Type of freeze
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of freeze
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ManualFreezeFreezeWindowRecurrenceArgs build() {
            return $;
        }
    }

}
