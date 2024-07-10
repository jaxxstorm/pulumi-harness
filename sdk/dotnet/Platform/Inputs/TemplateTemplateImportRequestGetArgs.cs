// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class TemplateTemplateImportRequestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the template.
        /// </summary>
        [Input("templateDescription")]
        public Input<string>? TemplateDescription { get; set; }

        /// <summary>
        /// Name of the template.
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        /// <summary>
        /// Version of the template.
        /// </summary>
        [Input("templateVersion")]
        public Input<string>? TemplateVersion { get; set; }

        public TemplateTemplateImportRequestGetArgs()
        {
        }
        public static new TemplateTemplateImportRequestGetArgs Empty => new TemplateTemplateImportRequestGetArgs();
    }
}
