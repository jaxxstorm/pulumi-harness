// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetUsergroupNotificationConfigArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Group email.
        /// </summary>
        [Input("groupEmail", required: true)]
        public string GroupEmail { get; set; } = null!;

        /// <summary>
        /// Url of Microsoft teams webhook.
        /// </summary>
        [Input("microsoftTeamsWebhookUrl", required: true)]
        public string MicrosoftTeamsWebhookUrl { get; set; } = null!;

        /// <summary>
        /// Pager duty key.
        /// </summary>
        [Input("pagerDutyKey", required: true)]
        public string PagerDutyKey { get; set; } = null!;

        /// <summary>
        /// Send email to all the group members.
        /// </summary>
        [Input("sendEmailToAllUsers", required: true)]
        public bool SendEmailToAllUsers { get; set; }

        /// <summary>
        /// Url of slack webhook.
        /// </summary>
        [Input("slackWebhookUrl", required: true)]
        public string SlackWebhookUrl { get; set; } = null!;

        /// <summary>
        /// Can be one of EMAIL, SLACK, PAGERDUTY, MSTEAMS.
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetUsergroupNotificationConfigArgs()
        {
        }
        public static new GetUsergroupNotificationConfigArgs Empty => new GetUsergroupNotificationConfigArgs();
    }
}