// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class NotificationRuleRequestCondition
    {
        /// <summary>
        /// Specification of the notification condition. Depends on the type of the notification condition.
        /// </summary>
        public readonly string? Spec;
        /// <summary>
        /// Type of the condition.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private NotificationRuleRequestCondition(
            string? spec,

            string type)
        {
            Spec = spec;
            Type = type;
        }
    }
}
