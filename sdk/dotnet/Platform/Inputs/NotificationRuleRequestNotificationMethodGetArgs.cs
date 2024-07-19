// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class NotificationRuleRequestNotificationMethodGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specification of the notification method. Depends on the type of the notification method.
        /// </summary>
        [Input("spec")]
        public Input<string>? Spec { get; set; }

        /// <summary>
        /// Type of the Notification Method.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NotificationRuleRequestNotificationMethodGetArgs()
        {
        }
        public static new NotificationRuleRequestNotificationMethodGetArgs Empty => new NotificationRuleRequestNotificationMethodGetArgs();
    }
}
