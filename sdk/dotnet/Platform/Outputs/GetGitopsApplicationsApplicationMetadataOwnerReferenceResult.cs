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
    public sealed class GetGitopsApplicationsApplicationMetadataOwnerReferenceResult
    {
        /// <summary>
        /// API version of the referent.
        /// </summary>
        public readonly string? ApiVersion;
        /// <summary>
        /// If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
        /// </summary>
        public readonly bool? BlockOwnerDeletion;
        /// <summary>
        /// Indicates if the reference points to the managing controller.
        /// </summary>
        public readonly bool? Controller;
        /// <summary>
        /// Kind of the referent.
        /// </summary>
        public readonly string? Kind;
        /// <summary>
        /// Name of the referent.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// UID of the referent.
        /// </summary>
        public readonly string? Uid;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationMetadataOwnerReferenceResult(
            string? apiVersion,

            bool? blockOwnerDeletion,

            bool? controller,

            string? kind,

            string? name,

            string? uid)
        {
            ApiVersion = apiVersion;
            BlockOwnerDeletion = blockOwnerDeletion;
            Controller = controller;
            Kind = kind;
            Name = name;
            Uid = uid;
        }
    }
}
