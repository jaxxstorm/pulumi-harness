// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Code of the external variables of jsonnet application.
        /// </summary>
        [Input("code")]
        public bool? Code { get; set; }

        /// <summary>
        /// Name of the external variables of jsonnet application.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Value of the external variables of jsonnet application.
        /// </summary>
        [Input("value")]
        public string? Value { get; set; }

        public GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs Empty => new GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVarArgs();
    }
}