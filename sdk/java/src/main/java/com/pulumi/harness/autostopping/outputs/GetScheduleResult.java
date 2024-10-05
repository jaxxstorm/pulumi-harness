// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.autostopping.outputs.GetScheduleRepeat;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetScheduleResult {
    /**
     * @return Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
     * 
     */
    private String endingOn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the schedule
     * 
     */
    private Double identifier;
    /**
     * @return Name of the schedule
     * 
     */
    private String name;
    /**
     * @return For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific &#39;time_period&#39; is specified
     * 
     */
    private List<GetScheduleRepeat> repeats;
    /**
     * @return ID of AutoStopping rules on which the schedule applies
     * 
     */
    private List<Double> rules;
    /**
     * @return Type of the schedule. Valid values are `uptime` and `downtime`
     * 
     */
    private String scheduleType;
    /**
     * @return Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
     * 
     */
    private String startingFrom;
    /**
     * @return Time zone in which schedule needs to be executed
     * 
     */
    private String timeZone;

    private GetScheduleResult() {}
    /**
     * @return Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
     * 
     */
    public String endingOn() {
        return this.endingOn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the schedule
     * 
     */
    public Double identifier() {
        return this.identifier;
    }
    /**
     * @return Name of the schedule
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific &#39;time_period&#39; is specified
     * 
     */
    public List<GetScheduleRepeat> repeats() {
        return this.repeats;
    }
    /**
     * @return ID of AutoStopping rules on which the schedule applies
     * 
     */
    public List<Double> rules() {
        return this.rules;
    }
    /**
     * @return Type of the schedule. Valid values are `uptime` and `downtime`
     * 
     */
    public String scheduleType() {
        return this.scheduleType;
    }
    /**
     * @return Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
     * 
     */
    public String startingFrom() {
        return this.startingFrom;
    }
    /**
     * @return Time zone in which schedule needs to be executed
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endingOn;
        private String id;
        private Double identifier;
        private String name;
        private List<GetScheduleRepeat> repeats;
        private List<Double> rules;
        private String scheduleType;
        private String startingFrom;
        private String timeZone;
        public Builder() {}
        public Builder(GetScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endingOn = defaults.endingOn;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.repeats = defaults.repeats;
    	      this.rules = defaults.rules;
    	      this.scheduleType = defaults.scheduleType;
    	      this.startingFrom = defaults.startingFrom;
    	      this.timeZone = defaults.timeZone;
        }

        @CustomType.Setter
        public Builder endingOn(String endingOn) {
            if (endingOn == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "endingOn");
            }
            this.endingOn = endingOn;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(Double identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder repeats(List<GetScheduleRepeat> repeats) {
            if (repeats == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "repeats");
            }
            this.repeats = repeats;
            return this;
        }
        public Builder repeats(GetScheduleRepeat... repeats) {
            return repeats(List.of(repeats));
        }
        @CustomType.Setter
        public Builder rules(List<Double> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(Double... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder scheduleType(String scheduleType) {
            if (scheduleType == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "scheduleType");
            }
            this.scheduleType = scheduleType;
            return this;
        }
        @CustomType.Setter
        public Builder startingFrom(String startingFrom) {
            if (startingFrom == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "startingFrom");
            }
            this.startingFrom = startingFrom;
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(String timeZone) {
            if (timeZone == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "timeZone");
            }
            this.timeZone = timeZone;
            return this;
        }
        public GetScheduleResult build() {
            final var _resultValue = new GetScheduleResult();
            _resultValue.endingOn = endingOn;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            _resultValue.repeats = repeats;
            _resultValue.rules = rules;
            _resultValue.scheduleType = scheduleType;
            _resultValue.startingFrom = startingFrom;
            _resultValue.timeZone = timeZone;
            return _resultValue;
        }
    }
}