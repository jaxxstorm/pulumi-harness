// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    public static class GetPermissions
    {
        /// <summary>
        /// Data source for retrieving permissions.
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
        ///     var test = Harness.Platform.GetPermissions.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPermissionsResult> InvokeAsync(GetPermissionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPermissionsResult>("harness:platform/getPermissions:getPermissions", args ?? new GetPermissionsArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving permissions.
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
        ///     var test = Harness.Platform.GetPermissions.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPermissionsResult> Invoke(GetPermissionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPermissionsResult>("harness:platform/getPermissions:getPermissions", args ?? new GetPermissionsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving permissions.
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
        ///     var test = Harness.Platform.GetPermissions.Invoke(new()
        ///     {
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPermissionsResult> Invoke(GetPermissionsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPermissionsResult>("harness:platform/getPermissions:getPermissions", args ?? new GetPermissionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPermissionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Organization Identifier
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetPermissionsArgs()
        {
        }
        public static new GetPermissionsArgs Empty => new GetPermissionsArgs();
    }

    public sealed class GetPermissionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Organization Identifier
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetPermissionsInvokeArgs()
        {
        }
        public static new GetPermissionsInvokeArgs Empty => new GetPermissionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetPermissionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Organization Identifier
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Response of the api
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPermissionsPermissionResult> Permissions;
        /// <summary>
        /// Project Identifier
        /// </summary>
        public readonly string? ProjectId;

        [OutputConstructor]
        private GetPermissionsResult(
            string id,

            string? orgId,

            ImmutableArray<Outputs.GetPermissionsPermissionResult> permissions,

            string? projectId)
        {
            Id = id;
            OrgId = orgId;
            Permissions = permissions;
            ProjectId = projectId;
        }
    }
}
