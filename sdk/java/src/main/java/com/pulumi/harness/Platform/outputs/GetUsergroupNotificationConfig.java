// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUsergroupNotificationConfig {
    /**
     * @return Group email.
     * 
     */
    private String groupEmail;
    /**
     * @return Url of Microsoft teams webhook.
     * 
     */
    private String microsoftTeamsWebhookUrl;
    /**
     * @return Pager duty key.
     * 
     */
    private String pagerDutyKey;
    /**
     * @return Send email to all the group members.
     * 
     */
    private Boolean sendEmailToAllUsers;
    /**
     * @return Url of slack webhook.
     * 
     */
    private String slackWebhookUrl;
    /**
     * @return Can be one of EMAIL, SLACK, PAGERDUTY, MSTEAMS.
     * 
     */
    private String type;

    private GetUsergroupNotificationConfig() {}
    /**
     * @return Group email.
     * 
     */
    public String groupEmail() {
        return this.groupEmail;
    }
    /**
     * @return Url of Microsoft teams webhook.
     * 
     */
    public String microsoftTeamsWebhookUrl() {
        return this.microsoftTeamsWebhookUrl;
    }
    /**
     * @return Pager duty key.
     * 
     */
    public String pagerDutyKey() {
        return this.pagerDutyKey;
    }
    /**
     * @return Send email to all the group members.
     * 
     */
    public Boolean sendEmailToAllUsers() {
        return this.sendEmailToAllUsers;
    }
    /**
     * @return Url of slack webhook.
     * 
     */
    public String slackWebhookUrl() {
        return this.slackWebhookUrl;
    }
    /**
     * @return Can be one of EMAIL, SLACK, PAGERDUTY, MSTEAMS.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsergroupNotificationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String groupEmail;
        private String microsoftTeamsWebhookUrl;
        private String pagerDutyKey;
        private Boolean sendEmailToAllUsers;
        private String slackWebhookUrl;
        private String type;
        public Builder() {}
        public Builder(GetUsergroupNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupEmail = defaults.groupEmail;
    	      this.microsoftTeamsWebhookUrl = defaults.microsoftTeamsWebhookUrl;
    	      this.pagerDutyKey = defaults.pagerDutyKey;
    	      this.sendEmailToAllUsers = defaults.sendEmailToAllUsers;
    	      this.slackWebhookUrl = defaults.slackWebhookUrl;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder groupEmail(String groupEmail) {
            this.groupEmail = Objects.requireNonNull(groupEmail);
            return this;
        }
        @CustomType.Setter
        public Builder microsoftTeamsWebhookUrl(String microsoftTeamsWebhookUrl) {
            this.microsoftTeamsWebhookUrl = Objects.requireNonNull(microsoftTeamsWebhookUrl);
            return this;
        }
        @CustomType.Setter
        public Builder pagerDutyKey(String pagerDutyKey) {
            this.pagerDutyKey = Objects.requireNonNull(pagerDutyKey);
            return this;
        }
        @CustomType.Setter
        public Builder sendEmailToAllUsers(Boolean sendEmailToAllUsers) {
            this.sendEmailToAllUsers = Objects.requireNonNull(sendEmailToAllUsers);
            return this;
        }
        @CustomType.Setter
        public Builder slackWebhookUrl(String slackWebhookUrl) {
            this.slackWebhookUrl = Objects.requireNonNull(slackWebhookUrl);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetUsergroupNotificationConfig build() {
            final var o = new GetUsergroupNotificationConfig();
            o.groupEmail = groupEmail;
            o.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            o.pagerDutyKey = pagerDutyKey;
            o.sendEmailToAllUsers = sendEmailToAllUsers;
            o.slackWebhookUrl = slackWebhookUrl;
            o.type = type;
            return o;
        }
    }
}
