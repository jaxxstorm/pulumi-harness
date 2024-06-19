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
    public sealed class GetTemplateFiltersFilterPropertyResult
    {
        /// <summary>
        /// Corresponding Entity of the filters. Currently supported types are {Connector, DelegateProfile, Delegate, TemplateSetup, TemplateExecution, Deployment, Audit, Template, EnvironmentGroup, FileStore, CCMRecommendation, Anomaly, Environment}.
        /// </summary>
        public readonly string FilterType;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetTemplateFiltersFilterPropertyResult(
            string filterType,

            ImmutableArray<string> tags)
        {
            FilterType = filterType;
            Tags = tags;
        }
    }
}
