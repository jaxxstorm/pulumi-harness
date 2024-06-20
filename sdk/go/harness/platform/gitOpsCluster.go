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

// Resource for creating a Harness Gitops Cluster.
//
// ## Import
//
// # Import a Account level Gitops Cluster
//
// ```sh
// $ pulumi import harness:platform/gitOpsCluster:GitOpsCluster example <agent_id>/<cluster_id>
// ```
//
// # Import a Project level Gitops Cluster
//
// ```sh
// $ pulumi import harness:platform/gitOpsCluster:GitOpsCluster example <organization_id>/<project_id>/<agent_id>/<cluster_id>
// ```
type GitOpsCluster struct {
	pulumi.CustomResourceState

	// Account identifier of the GitOps cluster.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Agent identifier of the GitOps cluster.
	AgentId pulumi.StringOutput `pulumi:"agentId"`
	// Identifier of the GitOps cluster.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Organization identifier of the cluster.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Project identifier of the GitOps cluster.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Query for the GitOps cluster resources.
	Queries GitOpsClusterQueryArrayOutput `pulumi:"queries"`
	// Cluster create or update request.
	Requests GitOpsClusterRequestArrayOutput `pulumi:"requests"`
}

// NewGitOpsCluster registers a new resource with the given unique name, arguments, and options.
func NewGitOpsCluster(ctx *pulumi.Context,
	name string, args *GitOpsClusterArgs, opts ...pulumi.ResourceOption) (*GitOpsCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.AgentId == nil {
		return nil, errors.New("invalid value for required argument 'AgentId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GitOpsCluster
	err := ctx.RegisterResource("harness:platform/gitOpsCluster:GitOpsCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGitOpsCluster gets an existing GitOpsCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGitOpsCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GitOpsClusterState, opts ...pulumi.ResourceOption) (*GitOpsCluster, error) {
	var resource GitOpsCluster
	err := ctx.ReadResource("harness:platform/gitOpsCluster:GitOpsCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GitOpsCluster resources.
type gitOpsClusterState struct {
	// Account identifier of the GitOps cluster.
	AccountId *string `pulumi:"accountId"`
	// Agent identifier of the GitOps cluster.
	AgentId *string `pulumi:"agentId"`
	// Identifier of the GitOps cluster.
	Identifier *string `pulumi:"identifier"`
	// Organization identifier of the cluster.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps cluster.
	ProjectId *string `pulumi:"projectId"`
	// Query for the GitOps cluster resources.
	Queries []GitOpsClusterQuery `pulumi:"queries"`
	// Cluster create or update request.
	Requests []GitOpsClusterRequest `pulumi:"requests"`
}

type GitOpsClusterState struct {
	// Account identifier of the GitOps cluster.
	AccountId pulumi.StringPtrInput
	// Agent identifier of the GitOps cluster.
	AgentId pulumi.StringPtrInput
	// Identifier of the GitOps cluster.
	Identifier pulumi.StringPtrInput
	// Organization identifier of the cluster.
	OrgId pulumi.StringPtrInput
	// Project identifier of the GitOps cluster.
	ProjectId pulumi.StringPtrInput
	// Query for the GitOps cluster resources.
	Queries GitOpsClusterQueryArrayInput
	// Cluster create or update request.
	Requests GitOpsClusterRequestArrayInput
}

func (GitOpsClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*gitOpsClusterState)(nil)).Elem()
}

type gitOpsClusterArgs struct {
	// Account identifier of the GitOps cluster.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps cluster.
	AgentId string `pulumi:"agentId"`
	// Identifier of the GitOps cluster.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the cluster.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps cluster.
	ProjectId *string `pulumi:"projectId"`
	// Query for the GitOps cluster resources.
	Queries []GitOpsClusterQuery `pulumi:"queries"`
	// Cluster create or update request.
	Requests []GitOpsClusterRequest `pulumi:"requests"`
}

// The set of arguments for constructing a GitOpsCluster resource.
type GitOpsClusterArgs struct {
	// Account identifier of the GitOps cluster.
	AccountId pulumi.StringInput
	// Agent identifier of the GitOps cluster.
	AgentId pulumi.StringInput
	// Identifier of the GitOps cluster.
	Identifier pulumi.StringInput
	// Organization identifier of the cluster.
	OrgId pulumi.StringPtrInput
	// Project identifier of the GitOps cluster.
	ProjectId pulumi.StringPtrInput
	// Query for the GitOps cluster resources.
	Queries GitOpsClusterQueryArrayInput
	// Cluster create or update request.
	Requests GitOpsClusterRequestArrayInput
}

func (GitOpsClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gitOpsClusterArgs)(nil)).Elem()
}

type GitOpsClusterInput interface {
	pulumi.Input

	ToGitOpsClusterOutput() GitOpsClusterOutput
	ToGitOpsClusterOutputWithContext(ctx context.Context) GitOpsClusterOutput
}

func (*GitOpsCluster) ElementType() reflect.Type {
	return reflect.TypeOf((**GitOpsCluster)(nil)).Elem()
}

func (i *GitOpsCluster) ToGitOpsClusterOutput() GitOpsClusterOutput {
	return i.ToGitOpsClusterOutputWithContext(context.Background())
}

func (i *GitOpsCluster) ToGitOpsClusterOutputWithContext(ctx context.Context) GitOpsClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitOpsClusterOutput)
}

// GitOpsClusterArrayInput is an input type that accepts GitOpsClusterArray and GitOpsClusterArrayOutput values.
// You can construct a concrete instance of `GitOpsClusterArrayInput` via:
//
//	GitOpsClusterArray{ GitOpsClusterArgs{...} }
type GitOpsClusterArrayInput interface {
	pulumi.Input

	ToGitOpsClusterArrayOutput() GitOpsClusterArrayOutput
	ToGitOpsClusterArrayOutputWithContext(context.Context) GitOpsClusterArrayOutput
}

type GitOpsClusterArray []GitOpsClusterInput

func (GitOpsClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GitOpsCluster)(nil)).Elem()
}

func (i GitOpsClusterArray) ToGitOpsClusterArrayOutput() GitOpsClusterArrayOutput {
	return i.ToGitOpsClusterArrayOutputWithContext(context.Background())
}

func (i GitOpsClusterArray) ToGitOpsClusterArrayOutputWithContext(ctx context.Context) GitOpsClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitOpsClusterArrayOutput)
}

// GitOpsClusterMapInput is an input type that accepts GitOpsClusterMap and GitOpsClusterMapOutput values.
// You can construct a concrete instance of `GitOpsClusterMapInput` via:
//
//	GitOpsClusterMap{ "key": GitOpsClusterArgs{...} }
type GitOpsClusterMapInput interface {
	pulumi.Input

	ToGitOpsClusterMapOutput() GitOpsClusterMapOutput
	ToGitOpsClusterMapOutputWithContext(context.Context) GitOpsClusterMapOutput
}

type GitOpsClusterMap map[string]GitOpsClusterInput

func (GitOpsClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GitOpsCluster)(nil)).Elem()
}

func (i GitOpsClusterMap) ToGitOpsClusterMapOutput() GitOpsClusterMapOutput {
	return i.ToGitOpsClusterMapOutputWithContext(context.Background())
}

func (i GitOpsClusterMap) ToGitOpsClusterMapOutputWithContext(ctx context.Context) GitOpsClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitOpsClusterMapOutput)
}

type GitOpsClusterOutput struct{ *pulumi.OutputState }

func (GitOpsClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GitOpsCluster)(nil)).Elem()
}

func (o GitOpsClusterOutput) ToGitOpsClusterOutput() GitOpsClusterOutput {
	return o
}

func (o GitOpsClusterOutput) ToGitOpsClusterOutputWithContext(ctx context.Context) GitOpsClusterOutput {
	return o
}

// Account identifier of the GitOps cluster.
func (o GitOpsClusterOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsCluster) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier of the GitOps cluster.
func (o GitOpsClusterOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsCluster) pulumi.StringOutput { return v.AgentId }).(pulumi.StringOutput)
}

// Identifier of the GitOps cluster.
func (o GitOpsClusterOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsCluster) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Organization identifier of the cluster.
func (o GitOpsClusterOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsCluster) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project identifier of the GitOps cluster.
func (o GitOpsClusterOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsCluster) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Query for the GitOps cluster resources.
func (o GitOpsClusterOutput) Queries() GitOpsClusterQueryArrayOutput {
	return o.ApplyT(func(v *GitOpsCluster) GitOpsClusterQueryArrayOutput { return v.Queries }).(GitOpsClusterQueryArrayOutput)
}

// Cluster create or update request.
func (o GitOpsClusterOutput) Requests() GitOpsClusterRequestArrayOutput {
	return o.ApplyT(func(v *GitOpsCluster) GitOpsClusterRequestArrayOutput { return v.Requests }).(GitOpsClusterRequestArrayOutput)
}

type GitOpsClusterArrayOutput struct{ *pulumi.OutputState }

func (GitOpsClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GitOpsCluster)(nil)).Elem()
}

func (o GitOpsClusterArrayOutput) ToGitOpsClusterArrayOutput() GitOpsClusterArrayOutput {
	return o
}

func (o GitOpsClusterArrayOutput) ToGitOpsClusterArrayOutputWithContext(ctx context.Context) GitOpsClusterArrayOutput {
	return o
}

func (o GitOpsClusterArrayOutput) Index(i pulumi.IntInput) GitOpsClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GitOpsCluster {
		return vs[0].([]*GitOpsCluster)[vs[1].(int)]
	}).(GitOpsClusterOutput)
}

type GitOpsClusterMapOutput struct{ *pulumi.OutputState }

func (GitOpsClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GitOpsCluster)(nil)).Elem()
}

func (o GitOpsClusterMapOutput) ToGitOpsClusterMapOutput() GitOpsClusterMapOutput {
	return o
}

func (o GitOpsClusterMapOutput) ToGitOpsClusterMapOutputWithContext(ctx context.Context) GitOpsClusterMapOutput {
	return o
}

func (o GitOpsClusterMapOutput) MapIndex(k pulumi.StringInput) GitOpsClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GitOpsCluster {
		return vs[0].(map[string]*GitOpsCluster)[vs[1].(string)]
	}).(GitOpsClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GitOpsClusterInput)(nil)).Elem(), &GitOpsCluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*GitOpsClusterArrayInput)(nil)).Elem(), GitOpsClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GitOpsClusterMapInput)(nil)).Elem(), GitOpsClusterMap{})
	pulumi.RegisterOutputType(GitOpsClusterOutput{})
	pulumi.RegisterOutputType(GitOpsClusterArrayOutput{})
	pulumi.RegisterOutputType(GitOpsClusterMapOutput{})
}
