// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.inputs.ScheduleRepeatArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
     * 
     */
    @Import(name="endingOn")
    private @Nullable Output<String> endingOn;

    /**
     * @return Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
     * 
     */
    public Optional<Output<String>> endingOn() {
        return Optional.ofNullable(this.endingOn);
    }

    /**
     * Name of the schedule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the schedule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific &#39;time_period&#39; is specified
     * 
     */
    @Import(name="repeats")
    private @Nullable Output<List<ScheduleRepeatArgs>> repeats;

    /**
     * @return For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific &#39;time_period&#39; is specified
     * 
     */
    public Optional<Output<List<ScheduleRepeatArgs>>> repeats() {
        return Optional.ofNullable(this.repeats);
    }

    /**
     * ID of AutoStopping rules on which the schedule applies
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<Double>> rules;

    /**
     * @return ID of AutoStopping rules on which the schedule applies
     * 
     */
    public Output<List<Double>> rules() {
        return this.rules;
    }

    /**
     * Type of the schedule. Valid values are `uptime` and `downtime`
     * 
     */
    @Import(name="scheduleType", required=true)
    private Output<String> scheduleType;

    /**
     * @return Type of the schedule. Valid values are `uptime` and `downtime`
     * 
     */
    public Output<String> scheduleType() {
        return this.scheduleType;
    }

    /**
     * Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
     * 
     */
    @Import(name="startingFrom")
    private @Nullable Output<String> startingFrom;

    /**
     * @return Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
     * 
     */
    public Optional<Output<String>> startingFrom() {
        return Optional.ofNullable(this.startingFrom);
    }

    /**
     * Time zone in which schedule needs to be executed
     * 
     */
    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    /**
     * @return Time zone in which schedule needs to be executed
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    private ScheduleArgs() {}

    private ScheduleArgs(ScheduleArgs $) {
        this.endingOn = $.endingOn;
        this.name = $.name;
        this.repeats = $.repeats;
        this.rules = $.rules;
        this.scheduleType = $.scheduleType;
        this.startingFrom = $.startingFrom;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleArgs $;

        public Builder() {
            $ = new ScheduleArgs();
        }

        public Builder(ScheduleArgs defaults) {
            $ = new ScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endingOn Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
         * 
         * @return builder
         * 
         */
        public Builder endingOn(@Nullable Output<String> endingOn) {
            $.endingOn = endingOn;
            return this;
        }

        /**
         * @param endingOn Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
         * 
         * @return builder
         * 
         */
        public Builder endingOn(String endingOn) {
            return endingOn(Output.of(endingOn));
        }

        /**
         * @param name Name of the schedule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the schedule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param repeats For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific &#39;time_period&#39; is specified
         * 
         * @return builder
         * 
         */
        public Builder repeats(@Nullable Output<List<ScheduleRepeatArgs>> repeats) {
            $.repeats = repeats;
            return this;
        }

        /**
         * @param repeats For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific &#39;time_period&#39; is specified
         * 
         * @return builder
         * 
         */
        public Builder repeats(List<ScheduleRepeatArgs> repeats) {
            return repeats(Output.of(repeats));
        }

        /**
         * @param repeats For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific &#39;time_period&#39; is specified
         * 
         * @return builder
         * 
         */
        public Builder repeats(ScheduleRepeatArgs... repeats) {
            return repeats(List.of(repeats));
        }

        /**
         * @param rules ID of AutoStopping rules on which the schedule applies
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<Double>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules ID of AutoStopping rules on which the schedule applies
         * 
         * @return builder
         * 
         */
        public Builder rules(List<Double> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules ID of AutoStopping rules on which the schedule applies
         * 
         * @return builder
         * 
         */
        public Builder rules(Double... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param scheduleType Type of the schedule. Valid values are `uptime` and `downtime`
         * 
         * @return builder
         * 
         */
        public Builder scheduleType(Output<String> scheduleType) {
            $.scheduleType = scheduleType;
            return this;
        }

        /**
         * @param scheduleType Type of the schedule. Valid values are `uptime` and `downtime`
         * 
         * @return builder
         * 
         */
        public Builder scheduleType(String scheduleType) {
            return scheduleType(Output.of(scheduleType));
        }

        /**
         * @param startingFrom Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
         * 
         * @return builder
         * 
         */
        public Builder startingFrom(@Nullable Output<String> startingFrom) {
            $.startingFrom = startingFrom;
            return this;
        }

        /**
         * @param startingFrom Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
         * 
         * @return builder
         * 
         */
        public Builder startingFrom(String startingFrom) {
            return startingFrom(Output.of(startingFrom));
        }

        /**
         * @param timeZone Time zone in which schedule needs to be executed
         * 
         * @return builder
         * 
         */
        public Builder timeZone(Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Time zone in which schedule needs to be executed
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public ScheduleArgs build() {
            if ($.rules == null) {
                throw new MissingRequiredPropertyException("ScheduleArgs", "rules");
            }
            if ($.scheduleType == null) {
                throw new MissingRequiredPropertyException("ScheduleArgs", "scheduleType");
            }
            if ($.timeZone == null) {
                throw new MissingRequiredPropertyException("ScheduleArgs", "timeZone");
            }
            return $;
        }
    }

}