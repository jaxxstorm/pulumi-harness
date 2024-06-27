// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetVariables
    {
        /// <summary>
        /// Data source for retrieving a Harness Variable.
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
        ///     var example = Harness.Platform.GetVariables.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetVariablesResult> InvokeAsync(GetVariablesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVariablesResult>("harness:platform/getVariables:getVariables", args ?? new GetVariablesArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness Variable.
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
        ///     var example = Harness.Platform.GetVariables.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetVariablesResult> Invoke(GetVariablesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVariablesResult>("harness:platform/getVariables:getVariables", args ?? new GetVariablesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVariablesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier for the Entity
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the Entity
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetVariablesArgs()
        {
        }
        public static new GetVariablesArgs Empty => new GetVariablesArgs();
    }

    public sealed class GetVariablesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Organization Identifier for the Entity
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the Entity
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetVariablesInvokeArgs()
        {
        }
        public static new GetVariablesInvokeArgs Empty => new GetVariablesInvokeArgs();
    }


    [OutputType]
    public sealed class GetVariablesResult
    {
        /// <summary>
        /// Description of the entity
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Name of the Variable
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Organization Identifier for the Entity
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Project Identifier for the Entity
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// List of Spce Fields.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVariablesSpecResult> Specs;
        /// <summary>
        /// Type of Variable
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetVariablesResult(
            string description,

            string id,

            string identifier,

            string name,

            string? orgId,

            string? projectId,

            ImmutableArray<Outputs.GetVariablesSpecResult> specs,

            string type)
        {
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Specs = specs;
            Type = type;
        }
    }
}