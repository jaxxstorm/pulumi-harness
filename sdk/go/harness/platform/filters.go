// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Harness Filter. This resource support filters of types {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewFilters(ctx, "test", &platform.FiltersArgs{
//				FilterProperties: &platform.FiltersFilterPropertiesArgs{
//					FilterType: pulumi.String("Connector"),
//					Tags: pulumi.StringArray{
//						pulumi.String("foo:bar"),
//					},
//				},
//				FilterVisibility: pulumi.String("EveryOne"),
//				Identifier:       pulumi.String("identifier"),
//				OrgId:            pulumi.String("org_id"),
//				ProjectId:        pulumi.String("project_id"),
//				Type:             pulumi.String("Connector"),
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
// # Import account level filter
//
// ```sh
//
//	$ pulumi import harness:platform/filters:Filters example <filter_id>/<type>
//
// ```
//
//	Import org level filter
//
// ```sh
//
//	$ pulumi import harness:platform/filters:Filters example <ord_id>/<filter_id>/<type>
//
// ```
//
//	Import project level filter
//
// ```sh
//
//	$ pulumi import harness:platform/filters:Filters example <org_id>/<project_id>/<filter_id>/<type>
//
// ```
type Filters struct {
	pulumi.CustomResourceState

	// Properties of the filter entity defined in Harness.
	FilterProperties FiltersFilterPropertiesOutput `pulumi:"filterProperties"`
	// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
	FilterVisibility pulumi.StringOutput `pulumi:"filterVisibility"`
	// Unique identifier of the resource
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the Filter
	Name pulumi.StringOutput `pulumi:"name"`
	// organization Identifier for the Entity
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// project Identifier for the Entity
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewFilters registers a new resource with the given unique name, arguments, and options.
func NewFilters(ctx *pulumi.Context,
	name string, args *FiltersArgs, opts ...pulumi.ResourceOption) (*Filters, error) {
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
	opts = pkgResourceDefaultOpts(opts)
	var resource Filters
	err := ctx.RegisterResource("harness:platform/filters:Filters", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFilters gets an existing Filters resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFilters(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FiltersState, opts ...pulumi.ResourceOption) (*Filters, error) {
	var resource Filters
	err := ctx.ReadResource("harness:platform/filters:Filters", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Filters resources.
type filtersState struct {
	// Properties of the filter entity defined in Harness.
	FilterProperties *FiltersFilterProperties `pulumi:"filterProperties"`
	// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
	FilterVisibility *string `pulumi:"filterVisibility"`
	// Unique identifier of the resource
	Identifier *string `pulumi:"identifier"`
	// Name of the Filter
	Name *string `pulumi:"name"`
	// organization Identifier for the Entity
	OrgId *string `pulumi:"orgId"`
	// project Identifier for the Entity
	ProjectId *string `pulumi:"projectId"`
	// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
	Type *string `pulumi:"type"`
}

type FiltersState struct {
	// Properties of the filter entity defined in Harness.
	FilterProperties FiltersFilterPropertiesPtrInput
	// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
	FilterVisibility pulumi.StringPtrInput
	// Unique identifier of the resource
	Identifier pulumi.StringPtrInput
	// Name of the Filter
	Name pulumi.StringPtrInput
	// organization Identifier for the Entity
	OrgId pulumi.StringPtrInput
	// project Identifier for the Entity
	ProjectId pulumi.StringPtrInput
	// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
	Type pulumi.StringPtrInput
}

func (FiltersState) ElementType() reflect.Type {
	return reflect.TypeOf((*filtersState)(nil)).Elem()
}

type filtersArgs struct {
	// Properties of the filter entity defined in Harness.
	FilterProperties FiltersFilterProperties `pulumi:"filterProperties"`
	// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
	FilterVisibility *string `pulumi:"filterVisibility"`
	// Unique identifier of the resource
	Identifier string `pulumi:"identifier"`
	// Name of the Filter
	Name *string `pulumi:"name"`
	// organization Identifier for the Entity
	OrgId *string `pulumi:"orgId"`
	// project Identifier for the Entity
	ProjectId *string `pulumi:"projectId"`
	// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Filters resource.
type FiltersArgs struct {
	// Properties of the filter entity defined in Harness.
	FilterProperties FiltersFilterPropertiesInput
	// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
	FilterVisibility pulumi.StringPtrInput
	// Unique identifier of the resource
	Identifier pulumi.StringInput
	// Name of the Filter
	Name pulumi.StringPtrInput
	// organization Identifier for the Entity
	OrgId pulumi.StringPtrInput
	// project Identifier for the Entity
	ProjectId pulumi.StringPtrInput
	// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
	Type pulumi.StringInput
}

func (FiltersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*filtersArgs)(nil)).Elem()
}

type FiltersInput interface {
	pulumi.Input

	ToFiltersOutput() FiltersOutput
	ToFiltersOutputWithContext(ctx context.Context) FiltersOutput
}

func (*Filters) ElementType() reflect.Type {
	return reflect.TypeOf((**Filters)(nil)).Elem()
}

func (i *Filters) ToFiltersOutput() FiltersOutput {
	return i.ToFiltersOutputWithContext(context.Background())
}

func (i *Filters) ToFiltersOutputWithContext(ctx context.Context) FiltersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FiltersOutput)
}

// FiltersArrayInput is an input type that accepts FiltersArray and FiltersArrayOutput values.
// You can construct a concrete instance of `FiltersArrayInput` via:
//
//	FiltersArray{ FiltersArgs{...} }
type FiltersArrayInput interface {
	pulumi.Input

	ToFiltersArrayOutput() FiltersArrayOutput
	ToFiltersArrayOutputWithContext(context.Context) FiltersArrayOutput
}

type FiltersArray []FiltersInput

func (FiltersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Filters)(nil)).Elem()
}

func (i FiltersArray) ToFiltersArrayOutput() FiltersArrayOutput {
	return i.ToFiltersArrayOutputWithContext(context.Background())
}

func (i FiltersArray) ToFiltersArrayOutputWithContext(ctx context.Context) FiltersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FiltersArrayOutput)
}

// FiltersMapInput is an input type that accepts FiltersMap and FiltersMapOutput values.
// You can construct a concrete instance of `FiltersMapInput` via:
//
//	FiltersMap{ "key": FiltersArgs{...} }
type FiltersMapInput interface {
	pulumi.Input

	ToFiltersMapOutput() FiltersMapOutput
	ToFiltersMapOutputWithContext(context.Context) FiltersMapOutput
}

type FiltersMap map[string]FiltersInput

func (FiltersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Filters)(nil)).Elem()
}

func (i FiltersMap) ToFiltersMapOutput() FiltersMapOutput {
	return i.ToFiltersMapOutputWithContext(context.Background())
}

func (i FiltersMap) ToFiltersMapOutputWithContext(ctx context.Context) FiltersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FiltersMapOutput)
}

type FiltersOutput struct{ *pulumi.OutputState }

func (FiltersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Filters)(nil)).Elem()
}

func (o FiltersOutput) ToFiltersOutput() FiltersOutput {
	return o
}

func (o FiltersOutput) ToFiltersOutputWithContext(ctx context.Context) FiltersOutput {
	return o
}

// Properties of the filter entity defined in Harness.
func (o FiltersOutput) FilterProperties() FiltersFilterPropertiesOutput {
	return o.ApplyT(func(v *Filters) FiltersFilterPropertiesOutput { return v.FilterProperties }).(FiltersFilterPropertiesOutput)
}

// This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
func (o FiltersOutput) FilterVisibility() pulumi.StringOutput {
	return o.ApplyT(func(v *Filters) pulumi.StringOutput { return v.FilterVisibility }).(pulumi.StringOutput)
}

// Unique identifier of the resource
func (o FiltersOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Filters) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the Filter
func (o FiltersOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Filters) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// organization Identifier for the Entity
func (o FiltersOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Filters) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// project Identifier for the Entity
func (o FiltersOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Filters) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
func (o FiltersOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Filters) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type FiltersArrayOutput struct{ *pulumi.OutputState }

func (FiltersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Filters)(nil)).Elem()
}

func (o FiltersArrayOutput) ToFiltersArrayOutput() FiltersArrayOutput {
	return o
}

func (o FiltersArrayOutput) ToFiltersArrayOutputWithContext(ctx context.Context) FiltersArrayOutput {
	return o
}

func (o FiltersArrayOutput) Index(i pulumi.IntInput) FiltersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Filters {
		return vs[0].([]*Filters)[vs[1].(int)]
	}).(FiltersOutput)
}

type FiltersMapOutput struct{ *pulumi.OutputState }

func (FiltersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Filters)(nil)).Elem()
}

func (o FiltersMapOutput) ToFiltersMapOutput() FiltersMapOutput {
	return o
}

func (o FiltersMapOutput) ToFiltersMapOutputWithContext(ctx context.Context) FiltersMapOutput {
	return o
}

func (o FiltersMapOutput) MapIndex(k pulumi.StringInput) FiltersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Filters {
		return vs[0].(map[string]*Filters)[vs[1].(string)]
	}).(FiltersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FiltersInput)(nil)).Elem(), &Filters{})
	pulumi.RegisterInputType(reflect.TypeOf((*FiltersArrayInput)(nil)).Elem(), FiltersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FiltersMapInput)(nil)).Elem(), FiltersMap{})
	pulumi.RegisterOutputType(FiltersOutput{})
	pulumi.RegisterOutputType(FiltersArrayOutput{})
	pulumi.RegisterOutputType(FiltersMapOutput{})
}
