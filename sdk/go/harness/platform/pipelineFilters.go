// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating Harness Pipeline Filters.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewPipelineFilters(ctx, "test", &platform.PipelineFiltersArgs{
//				Identifier: pulumi.String("identifier"),
//				Name:       pulumi.String("name"),
//				OrgId:      pulumi.String("org_id"),
//				ProjectId:  pulumi.String("project_id"),
//				Type:       pulumi.String("PipelineSetup"),
//				FilterProperties: &platform.PipelineFiltersFilterPropertiesArgs{
//					Name:        pulumi.String("pipeline_name"),
//					Description: pulumi.String("pipeline_description"),
//					PipelineIdentifiers: pulumi.StringArray{
//						pulumi.String("id1"),
//						pulumi.String("id2"),
//					},
//					FilterType: pulumi.String("PipelineSetup"),
//				},
//				FilterVisibility: pulumi.String("EveryOne"),
//			})
//			if err != nil {
//				return err
//			}
//			// pipeline execution filter consisiting services (service_identifiers) filter
//			_, err = platform.NewPipelineFilters(ctx, "execution", &platform.PipelineFiltersArgs{
//				Identifier: pulumi.String("identifier"),
//				Name:       pulumi.String("name"),
//				OrgId:      pulumi.String("org_id"),
//				ProjectId:  pulumi.String("project_id"),
//				Type:       pulumi.String("PipelineSetup"),
//				FilterProperties: &platform.PipelineFiltersFilterPropertiesArgs{
//					Name:        pulumi.String("pipeline_name"),
//					Description: pulumi.String("pipeline_description"),
//					PipelineIdentifiers: pulumi.StringArray{
//						pulumi.String("id1"),
//						pulumi.String("id2"),
//					},
//					FilterType: pulumi.String("PipelineExecution"),
//					ModuleProperties: &platform.PipelineFiltersFilterPropertiesModulePropertiesArgs{
//						Cd: &platform.PipelineFiltersFilterPropertiesModulePropertiesCdArgs{
//							DeploymentTypes: pulumi.String("Kubernetes"),
//							ServiceIdentifiers: pulumi.StringArray{
//								pulumi.String("nginx"),
//							},
//						},
//					},
//				},
//				FilterVisibility: pulumi.String("EveryOne"),
//			})
//			if err != nil {
//				return err
//			}
//			// pipeline filter with tags
//			_, err = platform.NewPipelineFilters(ctx, "example_with_tags", &platform.PipelineFiltersArgs{
//				Identifier: pulumi.String("identifier"),
//				Name:       pulumi.String("name"),
//				OrgId:      pulumi.String("org_id"),
//				ProjectId:  pulumi.String("project_id"),
//				Type:       pulumi.String("PipelineSetup"),
//				FilterProperties: &platform.PipelineFiltersFilterPropertiesArgs{
//					FilterType: pulumi.String("PipelineSetup"),
//					PipelineTags: pulumi.StringMapArray{
//						pulumi.StringMap{
//							"key":   pulumi.String("tag1"),
//							"value": pulumi.String("123"),
//						},
//						pulumi.StringMap{
//							"key":   pulumi.String("tag2"),
//							"value": pulumi.String("456"),
//						},
//					},
//					ModuleProperties: &platform.PipelineFiltersFilterPropertiesModulePropertiesArgs{
//						Cd: &platform.PipelineFiltersFilterPropertiesModulePropertiesCdArgs{
//							DeploymentTypes: pulumi.String("Kubernetes"),
//							ServiceNames: pulumi.StringArray{
//								pulumi.String("service1"),
//								pulumi.String("service2"),
//							},
//							EnvironmentNames: pulumi.StringArray{
//								pulumi.String("env1"),
//								pulumi.String("env2"),
//							},
//							ArtifactDisplayNames: pulumi.StringArray{
//								pulumi.String("artificatname1"),
//								pulumi.String("artifact2"),
//							},
//						},
//						Ci: &platform.PipelineFiltersFilterPropertiesModulePropertiesCiArgs{
//							BuildType: pulumi.String("branch"),
//							Branch:    pulumi.String("branch123"),
//							RepoNames: pulumi.String("repo1234"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewPipelineFilters(ctx, "pipelinemoduleproperties", &platform.PipelineFiltersArgs{
//				Identifier: pulumi.String("identifier"),
//				Name:       pulumi.String("name"),
//				OrgId:      pulumi.Any(testHarnessPlatformProject.OrgId),
//				ProjectId:  pulumi.Any(testHarnessPlatformProject.Id),
//				Type:       pulumi.String("PipelineExecution"),
//				FilterProperties: &platform.PipelineFiltersFilterPropertiesArgs{
//					FilterType:   pulumi.String("PipelineExecution"),
//					PipelineName: pulumi.String("test"),
//					PipelineTags: pulumi.StringMapArray{
//						pulumi.StringMap{
//							"key":   pulumi.String("k1"),
//							"value": pulumi.String("v1"),
//						},
//						pulumi.StringMap{
//							"key":   pulumi.String("k2"),
//							"value": pulumi.String("v2"),
//						},
//					},
//					ModuleProperties: &platform.PipelineFiltersFilterPropertiesModulePropertiesArgs{
//						Cd: &platform.PipelineFiltersFilterPropertiesModulePropertiesCdArgs{
//							ServiceDefinitionTypes: pulumi.String("Kubernetes"),
//							ServiceIdentifiers: pulumi.StringArray{
//								pulumi.String("K8"),
//							},
//							EnvironmentIdentifiers: pulumi.StringArray{
//								pulumi.String("dev"),
//							},
//							ArtifactDisplayNames: pulumi.StringArray{
//								pulumi.String("artificatname1"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Import account level pipeline filter
//
// ```sh
// $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <filter_id>/<type>
// ```
//
// # Import org level pipeline filter
//
// ```sh
// $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <ord_id>/<filter_id>/<type>
// ```
//
// # Import project level pipeline filter
//
// ```sh
// $ pulumi import harness:platform/pipelineFilters:PipelineFilters example <org_id>/<project_id>/<filter_id>/<type>
// ```
type PipelineFilters struct {
	pulumi.CustomResourceState

	// Properties of the filters entity defined in Harness.
	FilterProperties PipelineFiltersFilterPropertiesOutput `pulumi:"filterProperties"`
	// This indicates visibility of filters. By default, everyone can view this filter.
	FilterVisibility pulumi.StringOutput `pulumi:"filterVisibility"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the pipeline filters.
	Name pulumi.StringOutput `pulumi:"name"`
	// Organization Identifier for the Entity.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewPipelineFilters registers a new resource with the given unique name, arguments, and options.
func NewPipelineFilters(ctx *pulumi.Context,
	name string, args *PipelineFiltersArgs, opts ...pulumi.ResourceOption) (*PipelineFilters, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FilterProperties == nil {
		return nil, errors.New("invalid value for required argument 'FilterProperties'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PipelineFilters
	err := ctx.RegisterResource("harness:platform/pipelineFilters:PipelineFilters", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPipelineFilters gets an existing PipelineFilters resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPipelineFilters(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PipelineFiltersState, opts ...pulumi.ResourceOption) (*PipelineFilters, error) {
	var resource PipelineFilters
	err := ctx.ReadResource("harness:platform/pipelineFilters:PipelineFilters", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PipelineFilters resources.
type pipelineFiltersState struct {
	// Properties of the filters entity defined in Harness.
	FilterProperties *PipelineFiltersFilterProperties `pulumi:"filterProperties"`
	// This indicates visibility of filters. By default, everyone can view this filter.
	FilterVisibility *string `pulumi:"filterVisibility"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the pipeline filters.
	Name *string `pulumi:"name"`
	// Organization Identifier for the Entity.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId *string `pulumi:"projectId"`
	// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
	Type *string `pulumi:"type"`
}

type PipelineFiltersState struct {
	// Properties of the filters entity defined in Harness.
	FilterProperties PipelineFiltersFilterPropertiesPtrInput
	// This indicates visibility of filters. By default, everyone can view this filter.
	FilterVisibility pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the pipeline filters.
	Name pulumi.StringPtrInput
	// Organization Identifier for the Entity.
	OrgId pulumi.StringPtrInput
	// Project Identifier for the Entity.
	ProjectId pulumi.StringPtrInput
	// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
	Type pulumi.StringPtrInput
}

func (PipelineFiltersState) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineFiltersState)(nil)).Elem()
}

type pipelineFiltersArgs struct {
	// Properties of the filters entity defined in Harness.
	FilterProperties PipelineFiltersFilterProperties `pulumi:"filterProperties"`
	// This indicates visibility of filters. By default, everyone can view this filter.
	FilterVisibility *string `pulumi:"filterVisibility"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the pipeline filters.
	Name *string `pulumi:"name"`
	// Organization Identifier for the Entity.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId *string `pulumi:"projectId"`
	// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a PipelineFilters resource.
type PipelineFiltersArgs struct {
	// Properties of the filters entity defined in Harness.
	FilterProperties PipelineFiltersFilterPropertiesInput
	// This indicates visibility of filters. By default, everyone can view this filter.
	FilterVisibility pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the pipeline filters.
	Name pulumi.StringPtrInput
	// Organization Identifier for the Entity.
	OrgId pulumi.StringPtrInput
	// Project Identifier for the Entity.
	ProjectId pulumi.StringPtrInput
	// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
	Type pulumi.StringInput
}

func (PipelineFiltersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineFiltersArgs)(nil)).Elem()
}

type PipelineFiltersInput interface {
	pulumi.Input

	ToPipelineFiltersOutput() PipelineFiltersOutput
	ToPipelineFiltersOutputWithContext(ctx context.Context) PipelineFiltersOutput
}

func (*PipelineFilters) ElementType() reflect.Type {
	return reflect.TypeOf((**PipelineFilters)(nil)).Elem()
}

func (i *PipelineFilters) ToPipelineFiltersOutput() PipelineFiltersOutput {
	return i.ToPipelineFiltersOutputWithContext(context.Background())
}

func (i *PipelineFilters) ToPipelineFiltersOutputWithContext(ctx context.Context) PipelineFiltersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineFiltersOutput)
}

// PipelineFiltersArrayInput is an input type that accepts PipelineFiltersArray and PipelineFiltersArrayOutput values.
// You can construct a concrete instance of `PipelineFiltersArrayInput` via:
//
//	PipelineFiltersArray{ PipelineFiltersArgs{...} }
type PipelineFiltersArrayInput interface {
	pulumi.Input

	ToPipelineFiltersArrayOutput() PipelineFiltersArrayOutput
	ToPipelineFiltersArrayOutputWithContext(context.Context) PipelineFiltersArrayOutput
}

type PipelineFiltersArray []PipelineFiltersInput

func (PipelineFiltersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PipelineFilters)(nil)).Elem()
}

func (i PipelineFiltersArray) ToPipelineFiltersArrayOutput() PipelineFiltersArrayOutput {
	return i.ToPipelineFiltersArrayOutputWithContext(context.Background())
}

func (i PipelineFiltersArray) ToPipelineFiltersArrayOutputWithContext(ctx context.Context) PipelineFiltersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineFiltersArrayOutput)
}

// PipelineFiltersMapInput is an input type that accepts PipelineFiltersMap and PipelineFiltersMapOutput values.
// You can construct a concrete instance of `PipelineFiltersMapInput` via:
//
//	PipelineFiltersMap{ "key": PipelineFiltersArgs{...} }
type PipelineFiltersMapInput interface {
	pulumi.Input

	ToPipelineFiltersMapOutput() PipelineFiltersMapOutput
	ToPipelineFiltersMapOutputWithContext(context.Context) PipelineFiltersMapOutput
}

type PipelineFiltersMap map[string]PipelineFiltersInput

func (PipelineFiltersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PipelineFilters)(nil)).Elem()
}

func (i PipelineFiltersMap) ToPipelineFiltersMapOutput() PipelineFiltersMapOutput {
	return i.ToPipelineFiltersMapOutputWithContext(context.Background())
}

func (i PipelineFiltersMap) ToPipelineFiltersMapOutputWithContext(ctx context.Context) PipelineFiltersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineFiltersMapOutput)
}

type PipelineFiltersOutput struct{ *pulumi.OutputState }

func (PipelineFiltersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PipelineFilters)(nil)).Elem()
}

func (o PipelineFiltersOutput) ToPipelineFiltersOutput() PipelineFiltersOutput {
	return o
}

func (o PipelineFiltersOutput) ToPipelineFiltersOutputWithContext(ctx context.Context) PipelineFiltersOutput {
	return o
}

// Properties of the filters entity defined in Harness.
func (o PipelineFiltersOutput) FilterProperties() PipelineFiltersFilterPropertiesOutput {
	return o.ApplyT(func(v *PipelineFilters) PipelineFiltersFilterPropertiesOutput { return v.FilterProperties }).(PipelineFiltersFilterPropertiesOutput)
}

// This indicates visibility of filters. By default, everyone can view this filter.
func (o PipelineFiltersOutput) FilterVisibility() pulumi.StringOutput {
	return o.ApplyT(func(v *PipelineFilters) pulumi.StringOutput { return v.FilterVisibility }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o PipelineFiltersOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *PipelineFilters) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the pipeline filters.
func (o PipelineFiltersOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PipelineFilters) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier for the Entity.
func (o PipelineFiltersOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PipelineFilters) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project Identifier for the Entity.
func (o PipelineFiltersOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PipelineFilters) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Type of pipeline filters. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}
func (o PipelineFiltersOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *PipelineFilters) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type PipelineFiltersArrayOutput struct{ *pulumi.OutputState }

func (PipelineFiltersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PipelineFilters)(nil)).Elem()
}

func (o PipelineFiltersArrayOutput) ToPipelineFiltersArrayOutput() PipelineFiltersArrayOutput {
	return o
}

func (o PipelineFiltersArrayOutput) ToPipelineFiltersArrayOutputWithContext(ctx context.Context) PipelineFiltersArrayOutput {
	return o
}

func (o PipelineFiltersArrayOutput) Index(i pulumi.IntInput) PipelineFiltersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PipelineFilters {
		return vs[0].([]*PipelineFilters)[vs[1].(int)]
	}).(PipelineFiltersOutput)
}

type PipelineFiltersMapOutput struct{ *pulumi.OutputState }

func (PipelineFiltersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PipelineFilters)(nil)).Elem()
}

func (o PipelineFiltersMapOutput) ToPipelineFiltersMapOutput() PipelineFiltersMapOutput {
	return o
}

func (o PipelineFiltersMapOutput) ToPipelineFiltersMapOutputWithContext(ctx context.Context) PipelineFiltersMapOutput {
	return o
}

func (o PipelineFiltersMapOutput) MapIndex(k pulumi.StringInput) PipelineFiltersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PipelineFilters {
		return vs[0].(map[string]*PipelineFilters)[vs[1].(string)]
	}).(PipelineFiltersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineFiltersInput)(nil)).Elem(), &PipelineFilters{})
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineFiltersArrayInput)(nil)).Elem(), PipelineFiltersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineFiltersMapInput)(nil)).Elem(), PipelineFiltersMap{})
	pulumi.RegisterOutputType(PipelineFiltersOutput{})
	pulumi.RegisterOutputType(PipelineFiltersArrayOutput{})
	pulumi.RegisterOutputType(PipelineFiltersMapOutput{})
}
