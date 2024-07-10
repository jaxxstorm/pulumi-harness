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
    public sealed class FeatureFlagTargetGroupRule
    {
        /// <summary>
        /// The attribute to use in the clause.  This can be any target attribute
        /// </summary>
        public readonly string? Attribute;
        /// <summary>
        /// Is the operation negated?
        /// </summary>
        public readonly bool? Negate;
        /// <summary>
        /// The type of operation such as equals, starts_with, contains
        /// </summary>
        public readonly string? Op;
        /// <summary>
        /// The values that are compared against the operator
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private FeatureFlagTargetGroupRule(
            string? attribute,

            bool? negate,

            string? op,

            ImmutableArray<string> values)
        {
            Attribute = attribute;
            Negate = negate;
            Op = op;
            Values = values;
        }
    }
}
