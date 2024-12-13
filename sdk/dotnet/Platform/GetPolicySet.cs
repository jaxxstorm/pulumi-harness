// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetPolicySet
    {
        /// <summary>
        /// Data source for retrieving a Harness policyset.
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
        ///     var test = Harness.Platform.GetPolicySet.Invoke(new()
        ///     {
        ///         Identifier = "harness_platform_policyset.test.identifier",
        ///         Name = "harness_platform_policyset.test.name",
        ///         Action = "onrun",
        ///         Type = "pipeline",
        ///         Enabled = true,
        ///         Policies = new[]
        ///         {
        ///             new Harness.Platform.Inputs.GetPolicySetPolicyInputArgs
        ///             {
        ///                 Identifier = "always_run",
        ///                 Severity = "warning",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPolicySetResult> InvokeAsync(GetPolicySetArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPolicySetResult>("harness:platform/getPolicySet:getPolicySet", args ?? new GetPolicySetArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness policyset.
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
        ///     var test = Harness.Platform.GetPolicySet.Invoke(new()
        ///     {
        ///         Identifier = "harness_platform_policyset.test.identifier",
        ///         Name = "harness_platform_policyset.test.name",
        ///         Action = "onrun",
        ///         Type = "pipeline",
        ///         Enabled = true,
        ///         Policies = new[]
        ///         {
        ///             new Harness.Platform.Inputs.GetPolicySetPolicyInputArgs
        ///             {
        ///                 Identifier = "always_run",
        ///                 Severity = "warning",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicySetResult> Invoke(GetPolicySetInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicySetResult>("harness:platform/getPolicySet:getPolicySet", args ?? new GetPolicySetInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness policyset.
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
        ///     var test = Harness.Platform.GetPolicySet.Invoke(new()
        ///     {
        ///         Identifier = "harness_platform_policyset.test.identifier",
        ///         Name = "harness_platform_policyset.test.name",
        ///         Action = "onrun",
        ///         Type = "pipeline",
        ///         Enabled = true,
        ///         Policies = new[]
        ///         {
        ///             new Harness.Platform.Inputs.GetPolicySetPolicyInputArgs
        ///             {
        ///                 Identifier = "always_run",
        ///                 Severity = "warning",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPolicySetResult> Invoke(GetPolicySetInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPolicySetResult>("harness:platform/getPolicySet:getPolicySet", args ?? new GetPolicySetInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPolicySetArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Action code for the policyset.
        /// </summary>
        [Input("action", required: true)]
        public string Action { get; set; } = null!;

        /// <summary>
        /// Enabled for the policyset.
        /// </summary>
        [Input("enabled")]
        public bool? Enabled { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        [Input("policies")]
        private List<Inputs.GetPolicySetPolicyArgs>? _policies;

        /// <summary>
        /// List of policy identifiers / severity for the policyset.
        /// </summary>
        public List<Inputs.GetPolicySetPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new List<Inputs.GetPolicySetPolicyArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        /// <summary>
        /// Type of the policyset.
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetPolicySetArgs()
        {
        }
        public static new GetPolicySetArgs Empty => new GetPolicySetArgs();
    }

    public sealed class GetPolicySetInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Action code for the policyset.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Enabled for the policyset.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("policies")]
        private InputList<Inputs.GetPolicySetPolicyInputArgs>? _policies;

        /// <summary>
        /// List of policy identifiers / severity for the policyset.
        /// </summary>
        public InputList<Inputs.GetPolicySetPolicyInputArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.GetPolicySetPolicyInputArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Type of the policyset.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetPolicySetInvokeArgs()
        {
        }
        public static new GetPolicySetInvokeArgs Empty => new GetPolicySetInvokeArgs();
    }


    [OutputType]
    public sealed class GetPolicySetResult
    {
        /// <summary>
        /// Action code for the policyset.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Enabled for the policyset.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// List of policy identifiers / severity for the policyset.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPolicySetPolicyResult> Policies;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Type of the policyset.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPolicySetResult(
            string action,

            string description,

            bool? enabled,

            string id,

            string identifier,

            string? name,

            string? orgId,

            ImmutableArray<Outputs.GetPolicySetPolicyResult> policies,

            string? projectId,

            ImmutableArray<string> tags,

            string type)
        {
            Action = action;
            Description = description;
            Enabled = enabled;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            Policies = policies;
            ProjectId = projectId;
            Tags = tags;
            Type = type;
        }
    }
}
