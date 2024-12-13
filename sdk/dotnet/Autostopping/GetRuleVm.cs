// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping
{
    public static class GetRuleVm
    {
        /// <summary>
        /// Data source for retrieving a Harness Variable.
        /// </summary>
        public static Task<GetRuleVmResult> InvokeAsync(GetRuleVmArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRuleVmResult>("harness:autostopping/getRuleVm:getRuleVm", args ?? new GetRuleVmArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness Variable.
        /// </summary>
        public static Output<GetRuleVmResult> Invoke(GetRuleVmInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRuleVmResult>("harness:autostopping/getRuleVm:getRuleVm", args ?? new GetRuleVmInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness Variable.
        /// </summary>
        public static Output<GetRuleVmResult> Invoke(GetRuleVmInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRuleVmResult>("harness:autostopping/getRuleVm:getRuleVm", args ?? new GetRuleVmInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRuleVmArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        [Input("cloudConnectorId", required: true)]
        public string CloudConnectorId { get; set; } = null!;

        [Input("customDomains")]
        private List<string>? _customDomains;

        /// <summary>
        /// Custom URLs used to access the instances
        /// </summary>
        public List<string> CustomDomains
        {
            get => _customDomains ?? (_customDomains = new List<string>());
            set => _customDomains = value;
        }

        [Input("depends")]
        private List<Inputs.GetRuleVmDependArgs>? _depends;

        /// <summary>
        /// Dependent rules
        /// </summary>
        public List<Inputs.GetRuleVmDependArgs> Depends
        {
            get => _depends ?? (_depends = new List<Inputs.GetRuleVmDependArgs>());
            set => _depends = value;
        }

        [Input("filter", required: true)]
        public Inputs.GetRuleVmFilterArgs Filter { get; set; } = null!;

        [Input("https")]
        private List<Inputs.GetRuleVmHttpArgs>? _https;

        /// <summary>
        /// Http routing configuration
        /// </summary>
        public List<Inputs.GetRuleVmHttpArgs> Https
        {
            get => _https ?? (_https = new List<Inputs.GetRuleVmHttpArgs>());
            set => _https = value;
        }

        /// <summary>
        /// Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        /// </summary>
        [Input("idleTimeMins")]
        public int? IdleTimeMins { get; set; }

        /// <summary>
        /// Name of the rule
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tcps")]
        private List<Inputs.GetRuleVmTcpArgs>? _tcps;

        /// <summary>
        /// TCP routing configuration
        /// </summary>
        public List<Inputs.GetRuleVmTcpArgs> Tcps
        {
            get => _tcps ?? (_tcps = new List<Inputs.GetRuleVmTcpArgs>());
            set => _tcps = value;
        }

        /// <summary>
        /// Boolean that indicates whether the selected instances should be converted to spot vm
        /// </summary>
        [Input("useSpot")]
        public bool? UseSpot { get; set; }

        public GetRuleVmArgs()
        {
        }
        public static new GetRuleVmArgs Empty => new GetRuleVmArgs();
    }

    public sealed class GetRuleVmInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        [Input("cloudConnectorId", required: true)]
        public Input<string> CloudConnectorId { get; set; } = null!;

        [Input("customDomains")]
        private InputList<string>? _customDomains;

        /// <summary>
        /// Custom URLs used to access the instances
        /// </summary>
        public InputList<string> CustomDomains
        {
            get => _customDomains ?? (_customDomains = new InputList<string>());
            set => _customDomains = value;
        }

        [Input("depends")]
        private InputList<Inputs.GetRuleVmDependInputArgs>? _depends;

        /// <summary>
        /// Dependent rules
        /// </summary>
        public InputList<Inputs.GetRuleVmDependInputArgs> Depends
        {
            get => _depends ?? (_depends = new InputList<Inputs.GetRuleVmDependInputArgs>());
            set => _depends = value;
        }

        [Input("filter", required: true)]
        public Input<Inputs.GetRuleVmFilterInputArgs> Filter { get; set; } = null!;

        [Input("https")]
        private InputList<Inputs.GetRuleVmHttpInputArgs>? _https;

        /// <summary>
        /// Http routing configuration
        /// </summary>
        public InputList<Inputs.GetRuleVmHttpInputArgs> Https
        {
            get => _https ?? (_https = new InputList<Inputs.GetRuleVmHttpInputArgs>());
            set => _https = value;
        }

        /// <summary>
        /// Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        /// </summary>
        [Input("idleTimeMins")]
        public Input<int>? IdleTimeMins { get; set; }

        /// <summary>
        /// Name of the rule
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tcps")]
        private InputList<Inputs.GetRuleVmTcpInputArgs>? _tcps;

        /// <summary>
        /// TCP routing configuration
        /// </summary>
        public InputList<Inputs.GetRuleVmTcpInputArgs> Tcps
        {
            get => _tcps ?? (_tcps = new InputList<Inputs.GetRuleVmTcpInputArgs>());
            set => _tcps = value;
        }

        /// <summary>
        /// Boolean that indicates whether the selected instances should be converted to spot vm
        /// </summary>
        [Input("useSpot")]
        public Input<bool>? UseSpot { get; set; }

        public GetRuleVmInvokeArgs()
        {
        }
        public static new GetRuleVmInvokeArgs Empty => new GetRuleVmInvokeArgs();
    }


    [OutputType]
    public sealed class GetRuleVmResult
    {
        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        public readonly string CloudConnectorId;
        /// <summary>
        /// Custom URLs used to access the instances
        /// </summary>
        public readonly ImmutableArray<string> CustomDomains;
        /// <summary>
        /// Dependent rules
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleVmDependResult> Depends;
        public readonly Outputs.GetRuleVmFilterResult Filter;
        /// <summary>
        /// Http routing configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleVmHttpResult> Https;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        public readonly double Identifier;
        /// <summary>
        /// Idle time in minutes. This is the time that the AutoStopping rule waits before stopping the idle instances.
        /// </summary>
        public readonly int? IdleTimeMins;
        /// <summary>
        /// Name of the rule
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// TCP routing configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleVmTcpResult> Tcps;
        /// <summary>
        /// Boolean that indicates whether the selected instances should be converted to spot vm
        /// </summary>
        public readonly bool? UseSpot;

        [OutputConstructor]
        private GetRuleVmResult(
            string cloudConnectorId,

            ImmutableArray<string> customDomains,

            ImmutableArray<Outputs.GetRuleVmDependResult> depends,

            Outputs.GetRuleVmFilterResult filter,

            ImmutableArray<Outputs.GetRuleVmHttpResult> https,

            string id,

            double identifier,

            int? idleTimeMins,

            string name,

            ImmutableArray<Outputs.GetRuleVmTcpResult> tcps,

            bool? useSpot)
        {
            CloudConnectorId = cloudConnectorId;
            CustomDomains = customDomains;
            Depends = depends;
            Filter = filter;
            Https = https;
            Id = id;
            Identifier = identifier;
            IdleTimeMins = idleTimeMins;
            Name = name;
            Tcps = tcps;
            UseSpot = useSpot;
        }
    }
}
