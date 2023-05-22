// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Harness Gitops Repositories Certificates.
//
// ## Import
//
// # Import a Account level Gitops Repository Certificate
//
// ```sh
//
//	$ pulumi import harness:platform/gitopsRepoCert:GitopsRepoCert example <repocert_id>
//
// ```
type GitopsRepoCert struct {
	pulumi.CustomResourceState

	// account identifier of the Repository Certificates.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// agent identifier of the Repository Certificates.
	AgentId pulumi.StringOutput `pulumi:"agentId"`
	// organization identifier of the Repository Certificates.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// project identifier of the Repository Certificates.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Repository Certificates create/Update request.
	Requests GitopsRepoCertRequestArrayOutput `pulumi:"requests"`
}

// NewGitopsRepoCert registers a new resource with the given unique name, arguments, and options.
func NewGitopsRepoCert(ctx *pulumi.Context,
	name string, args *GitopsRepoCertArgs, opts ...pulumi.ResourceOption) (*GitopsRepoCert, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.AgentId == nil {
		return nil, errors.New("invalid value for required argument 'AgentId'")
	}
	if args.Requests == nil {
		return nil, errors.New("invalid value for required argument 'Requests'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource GitopsRepoCert
	err := ctx.RegisterResource("harness:platform/gitopsRepoCert:GitopsRepoCert", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGitopsRepoCert gets an existing GitopsRepoCert resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGitopsRepoCert(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GitopsRepoCertState, opts ...pulumi.ResourceOption) (*GitopsRepoCert, error) {
	var resource GitopsRepoCert
	err := ctx.ReadResource("harness:platform/gitopsRepoCert:GitopsRepoCert", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GitopsRepoCert resources.
type gitopsRepoCertState struct {
	// account identifier of the Repository Certificates.
	AccountId *string `pulumi:"accountId"`
	// agent identifier of the Repository Certificates.
	AgentId *string `pulumi:"agentId"`
	// organization identifier of the Repository Certificates.
	OrgId *string `pulumi:"orgId"`
	// project identifier of the Repository Certificates.
	ProjectId *string `pulumi:"projectId"`
	// Repository Certificates create/Update request.
	Requests []GitopsRepoCertRequest `pulumi:"requests"`
}

type GitopsRepoCertState struct {
	// account identifier of the Repository Certificates.
	AccountId pulumi.StringPtrInput
	// agent identifier of the Repository Certificates.
	AgentId pulumi.StringPtrInput
	// organization identifier of the Repository Certificates.
	OrgId pulumi.StringPtrInput
	// project identifier of the Repository Certificates.
	ProjectId pulumi.StringPtrInput
	// Repository Certificates create/Update request.
	Requests GitopsRepoCertRequestArrayInput
}

func (GitopsRepoCertState) ElementType() reflect.Type {
	return reflect.TypeOf((*gitopsRepoCertState)(nil)).Elem()
}

type gitopsRepoCertArgs struct {
	// account identifier of the Repository Certificates.
	AccountId string `pulumi:"accountId"`
	// agent identifier of the Repository Certificates.
	AgentId string `pulumi:"agentId"`
	// organization identifier of the Repository Certificates.
	OrgId *string `pulumi:"orgId"`
	// project identifier of the Repository Certificates.
	ProjectId *string `pulumi:"projectId"`
	// Repository Certificates create/Update request.
	Requests []GitopsRepoCertRequest `pulumi:"requests"`
}

// The set of arguments for constructing a GitopsRepoCert resource.
type GitopsRepoCertArgs struct {
	// account identifier of the Repository Certificates.
	AccountId pulumi.StringInput
	// agent identifier of the Repository Certificates.
	AgentId pulumi.StringInput
	// organization identifier of the Repository Certificates.
	OrgId pulumi.StringPtrInput
	// project identifier of the Repository Certificates.
	ProjectId pulumi.StringPtrInput
	// Repository Certificates create/Update request.
	Requests GitopsRepoCertRequestArrayInput
}

func (GitopsRepoCertArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gitopsRepoCertArgs)(nil)).Elem()
}

type GitopsRepoCertInput interface {
	pulumi.Input

	ToGitopsRepoCertOutput() GitopsRepoCertOutput
	ToGitopsRepoCertOutputWithContext(ctx context.Context) GitopsRepoCertOutput
}

func (*GitopsRepoCert) ElementType() reflect.Type {
	return reflect.TypeOf((**GitopsRepoCert)(nil)).Elem()
}

func (i *GitopsRepoCert) ToGitopsRepoCertOutput() GitopsRepoCertOutput {
	return i.ToGitopsRepoCertOutputWithContext(context.Background())
}

func (i *GitopsRepoCert) ToGitopsRepoCertOutputWithContext(ctx context.Context) GitopsRepoCertOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitopsRepoCertOutput)
}

// GitopsRepoCertArrayInput is an input type that accepts GitopsRepoCertArray and GitopsRepoCertArrayOutput values.
// You can construct a concrete instance of `GitopsRepoCertArrayInput` via:
//
//	GitopsRepoCertArray{ GitopsRepoCertArgs{...} }
type GitopsRepoCertArrayInput interface {
	pulumi.Input

	ToGitopsRepoCertArrayOutput() GitopsRepoCertArrayOutput
	ToGitopsRepoCertArrayOutputWithContext(context.Context) GitopsRepoCertArrayOutput
}

type GitopsRepoCertArray []GitopsRepoCertInput

func (GitopsRepoCertArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GitopsRepoCert)(nil)).Elem()
}

func (i GitopsRepoCertArray) ToGitopsRepoCertArrayOutput() GitopsRepoCertArrayOutput {
	return i.ToGitopsRepoCertArrayOutputWithContext(context.Background())
}

func (i GitopsRepoCertArray) ToGitopsRepoCertArrayOutputWithContext(ctx context.Context) GitopsRepoCertArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitopsRepoCertArrayOutput)
}

// GitopsRepoCertMapInput is an input type that accepts GitopsRepoCertMap and GitopsRepoCertMapOutput values.
// You can construct a concrete instance of `GitopsRepoCertMapInput` via:
//
//	GitopsRepoCertMap{ "key": GitopsRepoCertArgs{...} }
type GitopsRepoCertMapInput interface {
	pulumi.Input

	ToGitopsRepoCertMapOutput() GitopsRepoCertMapOutput
	ToGitopsRepoCertMapOutputWithContext(context.Context) GitopsRepoCertMapOutput
}

type GitopsRepoCertMap map[string]GitopsRepoCertInput

func (GitopsRepoCertMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GitopsRepoCert)(nil)).Elem()
}

func (i GitopsRepoCertMap) ToGitopsRepoCertMapOutput() GitopsRepoCertMapOutput {
	return i.ToGitopsRepoCertMapOutputWithContext(context.Background())
}

func (i GitopsRepoCertMap) ToGitopsRepoCertMapOutputWithContext(ctx context.Context) GitopsRepoCertMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitopsRepoCertMapOutput)
}

type GitopsRepoCertOutput struct{ *pulumi.OutputState }

func (GitopsRepoCertOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GitopsRepoCert)(nil)).Elem()
}

func (o GitopsRepoCertOutput) ToGitopsRepoCertOutput() GitopsRepoCertOutput {
	return o
}

func (o GitopsRepoCertOutput) ToGitopsRepoCertOutputWithContext(ctx context.Context) GitopsRepoCertOutput {
	return o
}

// account identifier of the Repository Certificates.
func (o GitopsRepoCertOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitopsRepoCert) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// agent identifier of the Repository Certificates.
func (o GitopsRepoCertOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitopsRepoCert) pulumi.StringOutput { return v.AgentId }).(pulumi.StringOutput)
}

// organization identifier of the Repository Certificates.
func (o GitopsRepoCertOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitopsRepoCert) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// project identifier of the Repository Certificates.
func (o GitopsRepoCertOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitopsRepoCert) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Repository Certificates create/Update request.
func (o GitopsRepoCertOutput) Requests() GitopsRepoCertRequestArrayOutput {
	return o.ApplyT(func(v *GitopsRepoCert) GitopsRepoCertRequestArrayOutput { return v.Requests }).(GitopsRepoCertRequestArrayOutput)
}

type GitopsRepoCertArrayOutput struct{ *pulumi.OutputState }

func (GitopsRepoCertArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GitopsRepoCert)(nil)).Elem()
}

func (o GitopsRepoCertArrayOutput) ToGitopsRepoCertArrayOutput() GitopsRepoCertArrayOutput {
	return o
}

func (o GitopsRepoCertArrayOutput) ToGitopsRepoCertArrayOutputWithContext(ctx context.Context) GitopsRepoCertArrayOutput {
	return o
}

func (o GitopsRepoCertArrayOutput) Index(i pulumi.IntInput) GitopsRepoCertOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GitopsRepoCert {
		return vs[0].([]*GitopsRepoCert)[vs[1].(int)]
	}).(GitopsRepoCertOutput)
}

type GitopsRepoCertMapOutput struct{ *pulumi.OutputState }

func (GitopsRepoCertMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GitopsRepoCert)(nil)).Elem()
}

func (o GitopsRepoCertMapOutput) ToGitopsRepoCertMapOutput() GitopsRepoCertMapOutput {
	return o
}

func (o GitopsRepoCertMapOutput) ToGitopsRepoCertMapOutputWithContext(ctx context.Context) GitopsRepoCertMapOutput {
	return o
}

func (o GitopsRepoCertMapOutput) MapIndex(k pulumi.StringInput) GitopsRepoCertOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GitopsRepoCert {
		return vs[0].(map[string]*GitopsRepoCert)[vs[1].(string)]
	}).(GitopsRepoCertOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GitopsRepoCertInput)(nil)).Elem(), &GitopsRepoCert{})
	pulumi.RegisterInputType(reflect.TypeOf((*GitopsRepoCertArrayInput)(nil)).Elem(), GitopsRepoCertArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GitopsRepoCertMapInput)(nil)).Elem(), GitopsRepoCertMap{})
	pulumi.RegisterOutputType(GitopsRepoCertOutput{})
	pulumi.RegisterOutputType(GitopsRepoCertArrayOutput{})
	pulumi.RegisterOutputType(GitopsRepoCertMapOutput{})
}
