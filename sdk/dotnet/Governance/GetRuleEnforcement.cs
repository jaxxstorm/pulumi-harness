// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Governance
{
    public static class GetRuleEnforcement
    {
        /// <summary>
        /// Datasource for looking up a rule enforcement.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Governance.GetRuleEnforcement.Invoke(new()
        ///     {
        ///         EnforcementId = "enforcement_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetRuleEnforcementResult> InvokeAsync(GetRuleEnforcementArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRuleEnforcementResult>("harness:governance/getRuleEnforcement:getRuleEnforcement", args ?? new GetRuleEnforcementArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a rule enforcement.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Governance.GetRuleEnforcement.Invoke(new()
        ///     {
        ///         EnforcementId = "enforcement_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRuleEnforcementResult> Invoke(GetRuleEnforcementInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRuleEnforcementResult>("harness:governance/getRuleEnforcement:getRuleEnforcement", args ?? new GetRuleEnforcementInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRuleEnforcementArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of rule enforcement.
        /// </summary>
        [Input("enforcementId", required: true)]
        public string EnforcementId { get; set; } = null!;

        public GetRuleEnforcementArgs()
        {
        }
        public static new GetRuleEnforcementArgs Empty => new GetRuleEnforcementArgs();
    }

    public sealed class GetRuleEnforcementInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of rule enforcement.
        /// </summary>
        [Input("enforcementId", required: true)]
        public Input<string> EnforcementId { get; set; } = null!;

        public GetRuleEnforcementInvokeArgs()
        {
        }
        public static new GetRuleEnforcementInvokeArgs Empty => new GetRuleEnforcementInvokeArgs();
    }


    [OutputType]
    public sealed class GetRuleEnforcementResult
    {
        /// <summary>
        /// The cloud provider for the rule enforcement.
        /// </summary>
        public readonly string CloudProvider;
        /// <summary>
        /// Description for rule enforcement.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Id of rule enforcement.
        /// </summary>
        public readonly string EnforcementId;
        /// <summary>
        /// Execution schedule in cron format.
        /// </summary>
        public readonly string ExecutionSchedule;
        /// <summary>
        /// Timezone for the execution schedule.
        /// </summary>
        public readonly string ExecutionTimezone;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Indicates if the rule enforcement is a dry run.
        /// </summary>
        public readonly bool IsDryRun;
        /// <summary>
        /// Indicates if the rule enforcement is enabled.
        /// </summary>
        public readonly bool IsEnabled;
        /// <summary>
        /// Name of the rule enforcement.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// List of rule IDs.
        /// </summary>
        public readonly ImmutableDictionary<string, string> RuleIds;
        /// <summary>
        /// List of rule set IDs.
        /// </summary>
        public readonly ImmutableDictionary<string, string> RuleSetIds;
        /// <summary>
        /// List of target accounts.
        /// </summary>
        public readonly ImmutableArray<string> TargetAccounts;
        /// <summary>
        /// List of target regions.
        /// </summary>
        public readonly ImmutableArray<string> TargetRegions;

        [OutputConstructor]
        private GetRuleEnforcementResult(
            string cloudProvider,

            string description,

            string enforcementId,

            string executionSchedule,

            string executionTimezone,

            string id,

            bool isDryRun,

            bool isEnabled,

            string name,

            ImmutableDictionary<string, string> ruleIds,

            ImmutableDictionary<string, string> ruleSetIds,

            ImmutableArray<string> targetAccounts,

            ImmutableArray<string> targetRegions)
        {
            CloudProvider = cloudProvider;
            Description = description;
            EnforcementId = enforcementId;
            ExecutionSchedule = executionSchedule;
            ExecutionTimezone = executionTimezone;
            Id = id;
            IsDryRun = isDryRun;
            IsEnabled = isEnabled;
            Name = name;
            RuleIds = ruleIds;
            RuleSetIds = ruleSetIds;
            TargetAccounts = targetAccounts;
            TargetRegions = targetRegions;
        }
    }
}