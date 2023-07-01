// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class MonitoredServiceRequest
    {
        /// <summary>
        /// Set of change sources for the monitored service.
        /// </summary>
        public readonly ImmutableArray<Outputs.MonitoredServiceRequestChangeSource> ChangeSources;
        /// <summary>
        /// Dependencies of the monitored service.
        /// </summary>
        public readonly ImmutableArray<Outputs.MonitoredServiceRequestDependency> Dependencies;
        /// <summary>
        /// Description for the monitored service.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Enable or disable the monitored service.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Environment in which the service is deployed.
        /// </summary>
        public readonly string EnvironmentRef;
        /// <summary>
        /// Environment reference list for the monitored service.
        /// </summary>
        public readonly ImmutableArray<string> EnvironmentRefLists;
        /// <summary>
        /// Set of health sources for the monitored service.
        /// </summary>
        public readonly ImmutableArray<Outputs.MonitoredServiceRequestHealthSource> HealthSources;
        /// <summary>
        /// Name for the monitored service.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Notification rule references for the monitored service.
        /// </summary>
        public readonly ImmutableArray<Outputs.MonitoredServiceRequestNotificationRuleRef> NotificationRuleRefs;
        /// <summary>
        /// Service reference for the monitored service.
        /// </summary>
        public readonly string ServiceRef;
        /// <summary>
        /// Tags for the monitored service. comma-separated key value string pairs.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Template reference for the monitored service.
        /// </summary>
        public readonly string? TemplateRef;
        /// <summary>
        /// Type of the monitored service.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Template version label for the monitored service.
        /// </summary>
        public readonly string? VersionLabel;

        [OutputConstructor]
        private MonitoredServiceRequest(
            ImmutableArray<Outputs.MonitoredServiceRequestChangeSource> changeSources,

            ImmutableArray<Outputs.MonitoredServiceRequestDependency> dependencies,

            string? description,

            bool? enabled,

            string environmentRef,

            ImmutableArray<string> environmentRefLists,

            ImmutableArray<Outputs.MonitoredServiceRequestHealthSource> healthSources,

            string name,

            ImmutableArray<Outputs.MonitoredServiceRequestNotificationRuleRef> notificationRuleRefs,

            string serviceRef,

            ImmutableArray<string> tags,

            string? templateRef,

            string type,

            string? versionLabel)
        {
            ChangeSources = changeSources;
            Dependencies = dependencies;
            Description = description;
            Enabled = enabled;
            EnvironmentRef = environmentRef;
            EnvironmentRefLists = environmentRefLists;
            HealthSources = healthSources;
            Name = name;
            NotificationRuleRefs = notificationRuleRefs;
            ServiceRef = serviceRef;
            Tags = tags;
            TemplateRef = templateRef;
            Type = type;
            VersionLabel = versionLabel;
        }
    }
}
