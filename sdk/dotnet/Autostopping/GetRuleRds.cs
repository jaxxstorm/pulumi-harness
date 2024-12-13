// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Autostopping
{
    public static class GetRuleRds
    {
        /// <summary>
        /// Data source for retrieving a Harness Variable.
        /// </summary>
        public static Task<GetRuleRdsResult> InvokeAsync(GetRuleRdsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRuleRdsResult>("harness:autostopping/getRuleRds:getRuleRds", args ?? new GetRuleRdsArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness Variable.
        /// </summary>
        public static Output<GetRuleRdsResult> Invoke(GetRuleRdsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRuleRdsResult>("harness:autostopping/getRuleRds:getRuleRds", args ?? new GetRuleRdsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness Variable.
        /// </summary>
        public static Output<GetRuleRdsResult> Invoke(GetRuleRdsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRuleRdsResult>("harness:autostopping/getRuleRds:getRuleRds", args ?? new GetRuleRdsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRuleRdsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        [Input("cloudConnectorId", required: true)]
        public string CloudConnectorId { get; set; } = null!;

        [Input("database", required: true)]
        public Inputs.GetRuleRdsDatabaseArgs Database { get; set; } = null!;

        [Input("depends")]
        private List<Inputs.GetRuleRdsDependArgs>? _depends;

        /// <summary>
        /// Dependent rules
        /// </summary>
        public List<Inputs.GetRuleRdsDependArgs> Depends
        {
            get => _depends ?? (_depends = new List<Inputs.GetRuleRdsDependArgs>());
            set => _depends = value;
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
        private List<Inputs.GetRuleRdsTcpArgs>? _tcps;

        /// <summary>
        /// TCP routing configuration
        /// </summary>
        public List<Inputs.GetRuleRdsTcpArgs> Tcps
        {
            get => _tcps ?? (_tcps = new List<Inputs.GetRuleRdsTcpArgs>());
            set => _tcps = value;
        }

        public GetRuleRdsArgs()
        {
        }
        public static new GetRuleRdsArgs Empty => new GetRuleRdsArgs();
    }

    public sealed class GetRuleRdsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        [Input("cloudConnectorId", required: true)]
        public Input<string> CloudConnectorId { get; set; } = null!;

        [Input("database", required: true)]
        public Input<Inputs.GetRuleRdsDatabaseInputArgs> Database { get; set; } = null!;

        [Input("depends")]
        private InputList<Inputs.GetRuleRdsDependInputArgs>? _depends;

        /// <summary>
        /// Dependent rules
        /// </summary>
        public InputList<Inputs.GetRuleRdsDependInputArgs> Depends
        {
            get => _depends ?? (_depends = new InputList<Inputs.GetRuleRdsDependInputArgs>());
            set => _depends = value;
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
        private InputList<Inputs.GetRuleRdsTcpInputArgs>? _tcps;

        /// <summary>
        /// TCP routing configuration
        /// </summary>
        public InputList<Inputs.GetRuleRdsTcpInputArgs> Tcps
        {
            get => _tcps ?? (_tcps = new InputList<Inputs.GetRuleRdsTcpInputArgs>());
            set => _tcps = value;
        }

        public GetRuleRdsInvokeArgs()
        {
        }
        public static new GetRuleRdsInvokeArgs Empty => new GetRuleRdsInvokeArgs();
    }


    [OutputType]
    public sealed class GetRuleRdsResult
    {
        /// <summary>
        /// Id of the cloud connector
        /// </summary>
        public readonly string CloudConnectorId;
        public readonly Outputs.GetRuleRdsDatabaseResult Database;
        /// <summary>
        /// Dependent rules
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRuleRdsDependResult> Depends;
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
        public readonly ImmutableArray<Outputs.GetRuleRdsTcpResult> Tcps;

        [OutputConstructor]
        private GetRuleRdsResult(
            string cloudConnectorId,

            Outputs.GetRuleRdsDatabaseResult database,

            ImmutableArray<Outputs.GetRuleRdsDependResult> depends,

            string id,

            double identifier,

            int? idleTimeMins,

            string name,

            ImmutableArray<Outputs.GetRuleRdsTcpResult> tcps)
        {
            CloudConnectorId = cloudConnectorId;
            Database = database;
            Depends = depends;
            Id = id;
            Identifier = identifier;
            IdleTimeMins = idleTimeMins;
            Name = name;
            Tcps = tcps;
        }
    }
}
