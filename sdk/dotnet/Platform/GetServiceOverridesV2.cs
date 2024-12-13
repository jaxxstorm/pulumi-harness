// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetServiceOverridesV2
    {
        /// <summary>
        /// Data source for Harness service overrides V2.
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
        ///     var test = Harness.Platform.GetServiceOverridesV2.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "orgIdentifier",
        ///         ProjectId = "projectIdentifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServiceOverridesV2Result> InvokeAsync(GetServiceOverridesV2Args args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceOverridesV2Result>("harness:platform/getServiceOverridesV2:getServiceOverridesV2", args ?? new GetServiceOverridesV2Args(), options.WithDefaults());

        /// <summary>
        /// Data source for Harness service overrides V2.
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
        ///     var test = Harness.Platform.GetServiceOverridesV2.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "orgIdentifier",
        ///         ProjectId = "projectIdentifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceOverridesV2Result> Invoke(GetServiceOverridesV2InvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceOverridesV2Result>("harness:platform/getServiceOverridesV2:getServiceOverridesV2", args ?? new GetServiceOverridesV2InvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for Harness service overrides V2.
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
        ///     var test = Harness.Platform.GetServiceOverridesV2.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "orgIdentifier",
        ///         ProjectId = "projectIdentifier",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServiceOverridesV2Result> Invoke(GetServiceOverridesV2InvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceOverridesV2Result>("harness:platform/getServiceOverridesV2:getServiceOverridesV2", args ?? new GetServiceOverridesV2InvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceOverridesV2Args : global::Pulumi.InvokeArgs
    {
        [Input("gitDetails")]
        public Inputs.GetServiceOverridesV2GitDetailsArgs? GitDetails { get; set; }

        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        [Input("orgId")]
        public string? OrgId { get; set; }

        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetServiceOverridesV2Args()
        {
        }
        public static new GetServiceOverridesV2Args Empty => new GetServiceOverridesV2Args();
    }

    public sealed class GetServiceOverridesV2InvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("gitDetails")]
        public Input<Inputs.GetServiceOverridesV2GitDetailsInputArgs>? GitDetails { get; set; }

        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetServiceOverridesV2InvokeArgs()
        {
        }
        public static new GetServiceOverridesV2InvokeArgs Empty => new GetServiceOverridesV2InvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceOverridesV2Result
    {
        public readonly string ClusterId;
        public readonly string EnvId;
        public readonly Outputs.GetServiceOverridesV2GitDetailsResult GitDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Identifier;
        public readonly string InfraId;
        public readonly string? OrgId;
        public readonly string? ProjectId;
        public readonly string ServiceId;
        public readonly string Type;
        public readonly string Yaml;

        [OutputConstructor]
        private GetServiceOverridesV2Result(
            string clusterId,

            string envId,

            Outputs.GetServiceOverridesV2GitDetailsResult gitDetails,

            string id,

            string identifier,

            string infraId,

            string? orgId,

            string? projectId,

            string serviceId,

            string type,

            string yaml)
        {
            ClusterId = clusterId;
            EnvId = envId;
            GitDetails = gitDetails;
            Id = id;
            Identifier = identifier;
            InfraId = infraId;
            OrgId = orgId;
            ProjectId = projectId;
            ServiceId = serviceId;
            Type = type;
            Yaml = yaml;
        }
    }
}
