// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping.Outputs
{

    [OutputType]
    public sealed class GetRuleEcsDependResult
    {
        /// <summary>
        /// Number of seconds the rule should wait after warming up the dependent rule
        /// </summary>
        public readonly int? DelayInSec;
        /// <summary>
        /// Rule id of the dependent rule
        /// </summary>
        public readonly int RuleId;

        [OutputConstructor]
        private GetRuleEcsDependResult(
            int? delayInSec,

            int ruleId)
        {
            DelayInSec = delayInSec;
            RuleId = ruleId;
        }
    }
}
