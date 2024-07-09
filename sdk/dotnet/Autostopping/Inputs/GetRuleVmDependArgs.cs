// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Inputs
{

    public sealed class GetRuleVmDependInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of seconds the rule should wait after warming up the dependent rule
        /// </summary>
        [Input("delayInSec")]
        public Input<int>? DelayInSec { get; set; }

        /// <summary>
        /// Rule id of the dependent rule
        /// </summary>
        [Input("ruleId", required: true)]
        public Input<int> RuleId { get; set; } = null!;

        public GetRuleVmDependInputArgs()
        {
        }
        public static new GetRuleVmDependInputArgs Empty => new GetRuleVmDependInputArgs();
    }
}