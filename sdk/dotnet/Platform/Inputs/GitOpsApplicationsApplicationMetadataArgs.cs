// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitOpsApplicationsApplicationMetadataArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations are unstructured key value pairs corresponding to a resource. External tools set these to store and retrieve arbitrary metadata.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Name of the cluster corresponding to the object. API server ignores this if set in any create or update request.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("finalizers")]
        private InputList<string>? _finalizers;

        /// <summary>
        /// Before the object is removed from the register, it must be empty. Each element serves as a unique identifier for the component that is accountable for removing that entry from the list. Entries in this list can only be removed if the object's deletionTimestamp is not null. The processing and removal of finalizers can happen in any sequence. No order is enforced as it may block the finalizers. Finalizers is a shared field that can be reordered by any actor with authority. If the finalizer list is processed in order, this could result in a scenario where the component in charge of the list's first finalizer is waiting for a signal (generated by a field value, an external system, or another) produced by a component in charge of the list's later finalizer.
        /// </summary>
        public InputList<string> Finalizers
        {
            get => _finalizers ?? (_finalizers = new InputList<string>());
            set => _finalizers = value;
        }

        /// <summary>
        /// An optional prefix that the server will only apply if the Name field is empty to create a unique name. The name returned to the client will differ from the name passed if this field is used. A unique suffix will be added to this value as well. The supplied value must adhere to the same validation guidelines as the Name field and may be reduced by the suffix length necessary to ensure that it is unique on the server. The server will NOT return a 409 if this field is supplied and the created name already exists; instead, it will either return 201 Created or 500 with Reason ServerTimeout, indicating that a unique name could not be found in the allotted time and the client should try again later.
        /// </summary>
        [Input("generateName")]
        public Input<string>? GenerateName { get; set; }

        /// <summary>
        /// A sequence number representing a specific generation of the desired state. This is a read-only value populated by the system.
        /// </summary>
        [Input("generation")]
        public Input<string>? Generation { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name must be unique within a namespace. It is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Name cannot be updated.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Namespace of the GitOps application. An empty namespace is equivalent to the namespace of the GitOps agent.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("ownerReferences")]
        private InputList<Inputs.GitOpsApplicationsApplicationMetadataOwnerReferenceArgs>? _ownerReferences;

        /// <summary>
        /// List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
        /// </summary>
        public InputList<Inputs.GitOpsApplicationsApplicationMetadataOwnerReferenceArgs> OwnerReferences
        {
            get => _ownerReferences ?? (_ownerReferences = new InputList<Inputs.GitOpsApplicationsApplicationMetadataOwnerReferenceArgs>());
            set => _ownerReferences = value;
        }

        /// <summary>
        /// UID is the unique identifier in time and space value for this object. It is generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        public GitOpsApplicationsApplicationMetadataArgs()
        {
        }
        public static new GitOpsApplicationsApplicationMetadataArgs Empty => new GitOpsApplicationsApplicationMetadataArgs();
    }
}
