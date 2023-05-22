// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing Feature Flags.
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
//			_, err := platform.NewFeatureFlag(ctx, "mybooleanflag", &platform.FeatureFlagArgs{
//				DefaultOffVariation: pulumi.String("Disabled"),
//				DefaultOnVariation:  pulumi.String("Enabled"),
//				Identifier:          pulumi.String("MY_FEATURE"),
//				Kind:                pulumi.String("boolean"),
//				OrgId:               pulumi.String("test"),
//				Permanent:           pulumi.Bool(false),
//				ProjectId:           pulumi.String("testff"),
//				Variations: platform.FeatureFlagVariationArray{
//					&platform.FeatureFlagVariationArgs{
//						Description: pulumi.String("The feature is enabled"),
//						Identifier:  pulumi.String("Enabled"),
//						Name:        pulumi.String("Enabled"),
//						Value:       pulumi.String("true"),
//					},
//					&platform.FeatureFlagVariationArgs{
//						Description: pulumi.String("The feature is disabled"),
//						Identifier:  pulumi.String("Disabled"),
//						Name:        pulumi.String("Disabled"),
//						Value:       pulumi.String("false"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewFeatureFlag(ctx, "mymultivariateflag", &platform.FeatureFlagArgs{
//				DefaultOffVariation: pulumi.String("trial20"),
//				DefaultOnVariation:  pulumi.String("trial7"),
//				Identifier:          pulumi.String("FREE_TRIAL_DURATION"),
//				Kind:                pulumi.String("int"),
//				OrgId:               pulumi.String("test"),
//				Permanent:           pulumi.Bool(false),
//				ProjectId:           pulumi.String("testff"),
//				Variations: platform.FeatureFlagVariationArray{
//					&platform.FeatureFlagVariationArgs{
//						Description: pulumi.String("Free trial period 7 days"),
//						Identifier:  pulumi.String("trial7"),
//						Name:        pulumi.String("7 days trial"),
//						Value:       pulumi.String("7"),
//					},
//					&platform.FeatureFlagVariationArgs{
//						Description: pulumi.String("Free trial period 14 days"),
//						Identifier:  pulumi.String("trial14"),
//						Name:        pulumi.String("14 days trial"),
//						Value:       pulumi.String("14"),
//					},
//					&platform.FeatureFlagVariationArgs{
//						Description: pulumi.String("Free trial period 20 days"),
//						Identifier:  pulumi.String("trial20"),
//						Name:        pulumi.String("20 days trial"),
//						Value:       pulumi.String("20"),
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
type FeatureFlag struct {
	pulumi.CustomResourceState

	// Whether or not the flag is archived
	Archived pulumi.BoolPtrOutput `pulumi:"archived"`
	// Which of the variations to use when the flag is toggled to off state
	DefaultOffVariation pulumi.StringOutput `pulumi:"defaultOffVariation"`
	// Which of the variations to use when the flag is toggled to on state
	DefaultOnVariation pulumi.StringOutput            `pulumi:"defaultOnVariation"`
	GitDetails         FeatureFlagGitDetailsPtrOutput `pulumi:"gitDetails"`
	// Identifier of the Feature Flag
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Name of the Feature Flag
	Name pulumi.StringOutput `pulumi:"name"`
	// Organization Identifier
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// The owner of the flag
	Owner pulumi.StringPtrOutput `pulumi:"owner"`
	// Whether or not the flag is permanent. If it is, it will never be flagged as stale
	Permanent pulumi.BoolOutput `pulumi:"permanent"`
	// Project Identifier
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The options available for your flag
	Variations FeatureFlagVariationArrayOutput `pulumi:"variations"`
}

// NewFeatureFlag registers a new resource with the given unique name, arguments, and options.
func NewFeatureFlag(ctx *pulumi.Context,
	name string, args *FeatureFlagArgs, opts ...pulumi.ResourceOption) (*FeatureFlag, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DefaultOffVariation == nil {
		return nil, errors.New("invalid value for required argument 'DefaultOffVariation'")
	}
	if args.DefaultOnVariation == nil {
		return nil, errors.New("invalid value for required argument 'DefaultOnVariation'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Permanent == nil {
		return nil, errors.New("invalid value for required argument 'Permanent'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Variations == nil {
		return nil, errors.New("invalid value for required argument 'Variations'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource FeatureFlag
	err := ctx.RegisterResource("harness:platform/featureFlag:FeatureFlag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFeatureFlag gets an existing FeatureFlag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFeatureFlag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FeatureFlagState, opts ...pulumi.ResourceOption) (*FeatureFlag, error) {
	var resource FeatureFlag
	err := ctx.ReadResource("harness:platform/featureFlag:FeatureFlag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FeatureFlag resources.
type featureFlagState struct {
	// Whether or not the flag is archived
	Archived *bool `pulumi:"archived"`
	// Which of the variations to use when the flag is toggled to off state
	DefaultOffVariation *string `pulumi:"defaultOffVariation"`
	// Which of the variations to use when the flag is toggled to on state
	DefaultOnVariation *string                `pulumi:"defaultOnVariation"`
	GitDetails         *FeatureFlagGitDetails `pulumi:"gitDetails"`
	// Identifier of the Feature Flag
	Identifier *string `pulumi:"identifier"`
	// The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
	Kind *string `pulumi:"kind"`
	// Name of the Feature Flag
	Name *string `pulumi:"name"`
	// Organization Identifier
	OrgId *string `pulumi:"orgId"`
	// The owner of the flag
	Owner *string `pulumi:"owner"`
	// Whether or not the flag is permanent. If it is, it will never be flagged as stale
	Permanent *bool `pulumi:"permanent"`
	// Project Identifier
	ProjectId *string `pulumi:"projectId"`
	// The options available for your flag
	Variations []FeatureFlagVariation `pulumi:"variations"`
}

type FeatureFlagState struct {
	// Whether or not the flag is archived
	Archived pulumi.BoolPtrInput
	// Which of the variations to use when the flag is toggled to off state
	DefaultOffVariation pulumi.StringPtrInput
	// Which of the variations to use when the flag is toggled to on state
	DefaultOnVariation pulumi.StringPtrInput
	GitDetails         FeatureFlagGitDetailsPtrInput
	// Identifier of the Feature Flag
	Identifier pulumi.StringPtrInput
	// The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
	Kind pulumi.StringPtrInput
	// Name of the Feature Flag
	Name pulumi.StringPtrInput
	// Organization Identifier
	OrgId pulumi.StringPtrInput
	// The owner of the flag
	Owner pulumi.StringPtrInput
	// Whether or not the flag is permanent. If it is, it will never be flagged as stale
	Permanent pulumi.BoolPtrInput
	// Project Identifier
	ProjectId pulumi.StringPtrInput
	// The options available for your flag
	Variations FeatureFlagVariationArrayInput
}

func (FeatureFlagState) ElementType() reflect.Type {
	return reflect.TypeOf((*featureFlagState)(nil)).Elem()
}

type featureFlagArgs struct {
	// Whether or not the flag is archived
	Archived *bool `pulumi:"archived"`
	// Which of the variations to use when the flag is toggled to off state
	DefaultOffVariation string `pulumi:"defaultOffVariation"`
	// Which of the variations to use when the flag is toggled to on state
	DefaultOnVariation string                 `pulumi:"defaultOnVariation"`
	GitDetails         *FeatureFlagGitDetails `pulumi:"gitDetails"`
	// Identifier of the Feature Flag
	Identifier string `pulumi:"identifier"`
	// The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
	Kind string `pulumi:"kind"`
	// Name of the Feature Flag
	Name *string `pulumi:"name"`
	// Organization Identifier
	OrgId string `pulumi:"orgId"`
	// The owner of the flag
	Owner *string `pulumi:"owner"`
	// Whether or not the flag is permanent. If it is, it will never be flagged as stale
	Permanent bool `pulumi:"permanent"`
	// Project Identifier
	ProjectId string `pulumi:"projectId"`
	// The options available for your flag
	Variations []FeatureFlagVariation `pulumi:"variations"`
}

// The set of arguments for constructing a FeatureFlag resource.
type FeatureFlagArgs struct {
	// Whether or not the flag is archived
	Archived pulumi.BoolPtrInput
	// Which of the variations to use when the flag is toggled to off state
	DefaultOffVariation pulumi.StringInput
	// Which of the variations to use when the flag is toggled to on state
	DefaultOnVariation pulumi.StringInput
	GitDetails         FeatureFlagGitDetailsPtrInput
	// Identifier of the Feature Flag
	Identifier pulumi.StringInput
	// The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
	Kind pulumi.StringInput
	// Name of the Feature Flag
	Name pulumi.StringPtrInput
	// Organization Identifier
	OrgId pulumi.StringInput
	// The owner of the flag
	Owner pulumi.StringPtrInput
	// Whether or not the flag is permanent. If it is, it will never be flagged as stale
	Permanent pulumi.BoolInput
	// Project Identifier
	ProjectId pulumi.StringInput
	// The options available for your flag
	Variations FeatureFlagVariationArrayInput
}

func (FeatureFlagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*featureFlagArgs)(nil)).Elem()
}

type FeatureFlagInput interface {
	pulumi.Input

	ToFeatureFlagOutput() FeatureFlagOutput
	ToFeatureFlagOutputWithContext(ctx context.Context) FeatureFlagOutput
}

func (*FeatureFlag) ElementType() reflect.Type {
	return reflect.TypeOf((**FeatureFlag)(nil)).Elem()
}

func (i *FeatureFlag) ToFeatureFlagOutput() FeatureFlagOutput {
	return i.ToFeatureFlagOutputWithContext(context.Background())
}

func (i *FeatureFlag) ToFeatureFlagOutputWithContext(ctx context.Context) FeatureFlagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagOutput)
}

// FeatureFlagArrayInput is an input type that accepts FeatureFlagArray and FeatureFlagArrayOutput values.
// You can construct a concrete instance of `FeatureFlagArrayInput` via:
//
//	FeatureFlagArray{ FeatureFlagArgs{...} }
type FeatureFlagArrayInput interface {
	pulumi.Input

	ToFeatureFlagArrayOutput() FeatureFlagArrayOutput
	ToFeatureFlagArrayOutputWithContext(context.Context) FeatureFlagArrayOutput
}

type FeatureFlagArray []FeatureFlagInput

func (FeatureFlagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FeatureFlag)(nil)).Elem()
}

func (i FeatureFlagArray) ToFeatureFlagArrayOutput() FeatureFlagArrayOutput {
	return i.ToFeatureFlagArrayOutputWithContext(context.Background())
}

func (i FeatureFlagArray) ToFeatureFlagArrayOutputWithContext(ctx context.Context) FeatureFlagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagArrayOutput)
}

// FeatureFlagMapInput is an input type that accepts FeatureFlagMap and FeatureFlagMapOutput values.
// You can construct a concrete instance of `FeatureFlagMapInput` via:
//
//	FeatureFlagMap{ "key": FeatureFlagArgs{...} }
type FeatureFlagMapInput interface {
	pulumi.Input

	ToFeatureFlagMapOutput() FeatureFlagMapOutput
	ToFeatureFlagMapOutputWithContext(context.Context) FeatureFlagMapOutput
}

type FeatureFlagMap map[string]FeatureFlagInput

func (FeatureFlagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FeatureFlag)(nil)).Elem()
}

func (i FeatureFlagMap) ToFeatureFlagMapOutput() FeatureFlagMapOutput {
	return i.ToFeatureFlagMapOutputWithContext(context.Background())
}

func (i FeatureFlagMap) ToFeatureFlagMapOutputWithContext(ctx context.Context) FeatureFlagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagMapOutput)
}

type FeatureFlagOutput struct{ *pulumi.OutputState }

func (FeatureFlagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FeatureFlag)(nil)).Elem()
}

func (o FeatureFlagOutput) ToFeatureFlagOutput() FeatureFlagOutput {
	return o
}

func (o FeatureFlagOutput) ToFeatureFlagOutputWithContext(ctx context.Context) FeatureFlagOutput {
	return o
}

// Whether or not the flag is archived
func (o FeatureFlagOutput) Archived() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.BoolPtrOutput { return v.Archived }).(pulumi.BoolPtrOutput)
}

// Which of the variations to use when the flag is toggled to off state
func (o FeatureFlagOutput) DefaultOffVariation() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.DefaultOffVariation }).(pulumi.StringOutput)
}

// Which of the variations to use when the flag is toggled to on state
func (o FeatureFlagOutput) DefaultOnVariation() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.DefaultOnVariation }).(pulumi.StringOutput)
}

func (o FeatureFlagOutput) GitDetails() FeatureFlagGitDetailsPtrOutput {
	return o.ApplyT(func(v *FeatureFlag) FeatureFlagGitDetailsPtrOutput { return v.GitDetails }).(FeatureFlagGitDetailsPtrOutput)
}

// Identifier of the Feature Flag
func (o FeatureFlagOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
func (o FeatureFlagOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Name of the Feature Flag
func (o FeatureFlagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier
func (o FeatureFlagOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// The owner of the flag
func (o FeatureFlagOutput) Owner() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringPtrOutput { return v.Owner }).(pulumi.StringPtrOutput)
}

// Whether or not the flag is permanent. If it is, it will never be flagged as stale
func (o FeatureFlagOutput) Permanent() pulumi.BoolOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.BoolOutput { return v.Permanent }).(pulumi.BoolOutput)
}

// Project Identifier
func (o FeatureFlagOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The options available for your flag
func (o FeatureFlagOutput) Variations() FeatureFlagVariationArrayOutput {
	return o.ApplyT(func(v *FeatureFlag) FeatureFlagVariationArrayOutput { return v.Variations }).(FeatureFlagVariationArrayOutput)
}

type FeatureFlagArrayOutput struct{ *pulumi.OutputState }

func (FeatureFlagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FeatureFlag)(nil)).Elem()
}

func (o FeatureFlagArrayOutput) ToFeatureFlagArrayOutput() FeatureFlagArrayOutput {
	return o
}

func (o FeatureFlagArrayOutput) ToFeatureFlagArrayOutputWithContext(ctx context.Context) FeatureFlagArrayOutput {
	return o
}

func (o FeatureFlagArrayOutput) Index(i pulumi.IntInput) FeatureFlagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FeatureFlag {
		return vs[0].([]*FeatureFlag)[vs[1].(int)]
	}).(FeatureFlagOutput)
}

type FeatureFlagMapOutput struct{ *pulumi.OutputState }

func (FeatureFlagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FeatureFlag)(nil)).Elem()
}

func (o FeatureFlagMapOutput) ToFeatureFlagMapOutput() FeatureFlagMapOutput {
	return o
}

func (o FeatureFlagMapOutput) ToFeatureFlagMapOutputWithContext(ctx context.Context) FeatureFlagMapOutput {
	return o
}

func (o FeatureFlagMapOutput) MapIndex(k pulumi.StringInput) FeatureFlagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FeatureFlag {
		return vs[0].(map[string]*FeatureFlag)[vs[1].(string)]
	}).(FeatureFlagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagInput)(nil)).Elem(), &FeatureFlag{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagArrayInput)(nil)).Elem(), FeatureFlagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagMapInput)(nil)).Elem(), FeatureFlagMap{})
	pulumi.RegisterOutputType(FeatureFlagOutput{})
	pulumi.RegisterOutputType(FeatureFlagArrayOutput{})
	pulumi.RegisterOutputType(FeatureFlagMapOutput{})
}
