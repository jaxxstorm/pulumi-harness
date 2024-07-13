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
    public sealed class GetRuleRdsDatabaseResult
    {
        /// <summary>
        /// ID of the database
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Region to which database belong to
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private GetRuleRdsDatabaseResult(
            string id,

            string region)
        {
            Id = id;
            Region = region;
        }
    }
}