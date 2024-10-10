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

// Resource for creating files in Harness.
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
//			// Create file
//			_, err := platform.NewFileStoreFile(ctx, "example", &platform.FileStoreFileArgs{
//				OrgId:       pulumi.String("org_id"),
//				ProjectId:   pulumi.String("project_id"),
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("description"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//					pulumi.String("baz:qux"),
//				},
//				ParentIdentifier: pulumi.String("parent_identifier"),
//				FileContentPath:  pulumi.String("file_content_path"),
//				MimeType:         pulumi.String("mime_type"),
//				FileUsage:        pulumi.String("MANIFEST_FILE|CONFIG|SCRIPT"),
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
// # Import account level file
//
// ```sh
// $ pulumi import harness:platform/fileStoreFile:FileStoreFile example <identifier>
// ```
//
// # Import org level file
//
// ```sh
// $ pulumi import harness:platform/fileStoreFile:FileStoreFile example <org_id>/<identifier>
// ```
//
// # Import org level file
//
// ```sh
// $ pulumi import harness:platform/fileStoreFile:FileStoreFile example <org_id>/<project_id>/<identifier>
// ```
type FileStoreFile struct {
	pulumi.CustomResourceState

	// File content stored on Harness File Store
	Content pulumi.StringPtrOutput `pulumi:"content"`
	// Created by
	CreatedBies FileStoreFileCreatedByArrayOutput `pulumi:"createdBies"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// File content path to be upladed on Harness File Store
	FileContentPath pulumi.StringPtrOutput `pulumi:"fileContentPath"`
	// File usage. Valid options are ManifestFile, Config, Script
	FileUsage pulumi.StringOutput `pulumi:"fileUsage"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Last modified at
	LastModifiedAt pulumi.IntOutput `pulumi:"lastModifiedAt"`
	// Last modified by
	LastModifiedBies FileStoreFileLastModifiedByArrayOutput `pulumi:"lastModifiedBies"`
	// File mime type
	MimeType pulumi.StringOutput `pulumi:"mimeType"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// File parent identifier on Harness File Store. If the folder is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier pulumi.StringOutput `pulumi:"parentIdentifier"`
	// Harness File Store file path
	Path pulumi.StringOutput `pulumi:"path"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewFileStoreFile registers a new resource with the given unique name, arguments, and options.
func NewFileStoreFile(ctx *pulumi.Context,
	name string, args *FileStoreFileArgs, opts ...pulumi.ResourceOption) (*FileStoreFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.ParentIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ParentIdentifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FileStoreFile
	err := ctx.RegisterResource("harness:platform/fileStoreFile:FileStoreFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFileStoreFile gets an existing FileStoreFile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFileStoreFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FileStoreFileState, opts ...pulumi.ResourceOption) (*FileStoreFile, error) {
	var resource FileStoreFile
	err := ctx.ReadResource("harness:platform/fileStoreFile:FileStoreFile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FileStoreFile resources.
type fileStoreFileState struct {
	// File content stored on Harness File Store
	Content *string `pulumi:"content"`
	// Created by
	CreatedBies []FileStoreFileCreatedBy `pulumi:"createdBies"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// File content path to be upladed on Harness File Store
	FileContentPath *string `pulumi:"fileContentPath"`
	// File usage. Valid options are ManifestFile, Config, Script
	FileUsage *string `pulumi:"fileUsage"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Last modified at
	LastModifiedAt *int `pulumi:"lastModifiedAt"`
	// Last modified by
	LastModifiedBies []FileStoreFileLastModifiedBy `pulumi:"lastModifiedBies"`
	// File mime type
	MimeType *string `pulumi:"mimeType"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// File parent identifier on Harness File Store. If the folder is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier *string `pulumi:"parentIdentifier"`
	// Harness File Store file path
	Path *string `pulumi:"path"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

type FileStoreFileState struct {
	// File content stored on Harness File Store
	Content pulumi.StringPtrInput
	// Created by
	CreatedBies FileStoreFileCreatedByArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// File content path to be upladed on Harness File Store
	FileContentPath pulumi.StringPtrInput
	// File usage. Valid options are ManifestFile, Config, Script
	FileUsage pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Last modified at
	LastModifiedAt pulumi.IntPtrInput
	// Last modified by
	LastModifiedBies FileStoreFileLastModifiedByArrayInput
	// File mime type
	MimeType pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// File parent identifier on Harness File Store. If the folder is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier pulumi.StringPtrInput
	// Harness File Store file path
	Path pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (FileStoreFileState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileStoreFileState)(nil)).Elem()
}

type fileStoreFileArgs struct {
	// File content stored on Harness File Store
	Content *string `pulumi:"content"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// File content path to be upladed on Harness File Store
	FileContentPath *string `pulumi:"fileContentPath"`
	// File usage. Valid options are ManifestFile, Config, Script
	FileUsage *string `pulumi:"fileUsage"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// File mime type
	MimeType *string `pulumi:"mimeType"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// File parent identifier on Harness File Store. If the folder is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier string `pulumi:"parentIdentifier"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a FileStoreFile resource.
type FileStoreFileArgs struct {
	// File content stored on Harness File Store
	Content pulumi.StringPtrInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// File content path to be upladed on Harness File Store
	FileContentPath pulumi.StringPtrInput
	// File usage. Valid options are ManifestFile, Config, Script
	FileUsage pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// File mime type
	MimeType pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// File parent identifier on Harness File Store. If the folder is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier pulumi.StringInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (FileStoreFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fileStoreFileArgs)(nil)).Elem()
}

type FileStoreFileInput interface {
	pulumi.Input

	ToFileStoreFileOutput() FileStoreFileOutput
	ToFileStoreFileOutputWithContext(ctx context.Context) FileStoreFileOutput
}

func (*FileStoreFile) ElementType() reflect.Type {
	return reflect.TypeOf((**FileStoreFile)(nil)).Elem()
}

func (i *FileStoreFile) ToFileStoreFileOutput() FileStoreFileOutput {
	return i.ToFileStoreFileOutputWithContext(context.Background())
}

func (i *FileStoreFile) ToFileStoreFileOutputWithContext(ctx context.Context) FileStoreFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileStoreFileOutput)
}

// FileStoreFileArrayInput is an input type that accepts FileStoreFileArray and FileStoreFileArrayOutput values.
// You can construct a concrete instance of `FileStoreFileArrayInput` via:
//
//	FileStoreFileArray{ FileStoreFileArgs{...} }
type FileStoreFileArrayInput interface {
	pulumi.Input

	ToFileStoreFileArrayOutput() FileStoreFileArrayOutput
	ToFileStoreFileArrayOutputWithContext(context.Context) FileStoreFileArrayOutput
}

type FileStoreFileArray []FileStoreFileInput

func (FileStoreFileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileStoreFile)(nil)).Elem()
}

func (i FileStoreFileArray) ToFileStoreFileArrayOutput() FileStoreFileArrayOutput {
	return i.ToFileStoreFileArrayOutputWithContext(context.Background())
}

func (i FileStoreFileArray) ToFileStoreFileArrayOutputWithContext(ctx context.Context) FileStoreFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileStoreFileArrayOutput)
}

// FileStoreFileMapInput is an input type that accepts FileStoreFileMap and FileStoreFileMapOutput values.
// You can construct a concrete instance of `FileStoreFileMapInput` via:
//
//	FileStoreFileMap{ "key": FileStoreFileArgs{...} }
type FileStoreFileMapInput interface {
	pulumi.Input

	ToFileStoreFileMapOutput() FileStoreFileMapOutput
	ToFileStoreFileMapOutputWithContext(context.Context) FileStoreFileMapOutput
}

type FileStoreFileMap map[string]FileStoreFileInput

func (FileStoreFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileStoreFile)(nil)).Elem()
}

func (i FileStoreFileMap) ToFileStoreFileMapOutput() FileStoreFileMapOutput {
	return i.ToFileStoreFileMapOutputWithContext(context.Background())
}

func (i FileStoreFileMap) ToFileStoreFileMapOutputWithContext(ctx context.Context) FileStoreFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileStoreFileMapOutput)
}

type FileStoreFileOutput struct{ *pulumi.OutputState }

func (FileStoreFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FileStoreFile)(nil)).Elem()
}

func (o FileStoreFileOutput) ToFileStoreFileOutput() FileStoreFileOutput {
	return o
}

func (o FileStoreFileOutput) ToFileStoreFileOutputWithContext(ctx context.Context) FileStoreFileOutput {
	return o
}

// File content stored on Harness File Store
func (o FileStoreFileOutput) Content() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringPtrOutput { return v.Content }).(pulumi.StringPtrOutput)
}

// Created by
func (o FileStoreFileOutput) CreatedBies() FileStoreFileCreatedByArrayOutput {
	return o.ApplyT(func(v *FileStoreFile) FileStoreFileCreatedByArrayOutput { return v.CreatedBies }).(FileStoreFileCreatedByArrayOutput)
}

// Description of the resource.
func (o FileStoreFileOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// File content path to be upladed on Harness File Store
func (o FileStoreFileOutput) FileContentPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringPtrOutput { return v.FileContentPath }).(pulumi.StringPtrOutput)
}

// File usage. Valid options are ManifestFile, Config, Script
func (o FileStoreFileOutput) FileUsage() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringOutput { return v.FileUsage }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o FileStoreFileOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Last modified at
func (o FileStoreFileOutput) LastModifiedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.IntOutput { return v.LastModifiedAt }).(pulumi.IntOutput)
}

// Last modified by
func (o FileStoreFileOutput) LastModifiedBies() FileStoreFileLastModifiedByArrayOutput {
	return o.ApplyT(func(v *FileStoreFile) FileStoreFileLastModifiedByArrayOutput { return v.LastModifiedBies }).(FileStoreFileLastModifiedByArrayOutput)
}

// File mime type
func (o FileStoreFileOutput) MimeType() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringOutput { return v.MimeType }).(pulumi.StringOutput)
}

// Name of the resource.
func (o FileStoreFileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o FileStoreFileOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// File parent identifier on Harness File Store. If the folder is at the root level, the parentIdentifier will be `Root`.
func (o FileStoreFileOutput) ParentIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringOutput { return v.ParentIdentifier }).(pulumi.StringOutput)
}

// Harness File Store file path
func (o FileStoreFileOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringOutput { return v.Path }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o FileStoreFileOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o FileStoreFileOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FileStoreFile) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type FileStoreFileArrayOutput struct{ *pulumi.OutputState }

func (FileStoreFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileStoreFile)(nil)).Elem()
}

func (o FileStoreFileArrayOutput) ToFileStoreFileArrayOutput() FileStoreFileArrayOutput {
	return o
}

func (o FileStoreFileArrayOutput) ToFileStoreFileArrayOutputWithContext(ctx context.Context) FileStoreFileArrayOutput {
	return o
}

func (o FileStoreFileArrayOutput) Index(i pulumi.IntInput) FileStoreFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FileStoreFile {
		return vs[0].([]*FileStoreFile)[vs[1].(int)]
	}).(FileStoreFileOutput)
}

type FileStoreFileMapOutput struct{ *pulumi.OutputState }

func (FileStoreFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileStoreFile)(nil)).Elem()
}

func (o FileStoreFileMapOutput) ToFileStoreFileMapOutput() FileStoreFileMapOutput {
	return o
}

func (o FileStoreFileMapOutput) ToFileStoreFileMapOutputWithContext(ctx context.Context) FileStoreFileMapOutput {
	return o
}

func (o FileStoreFileMapOutput) MapIndex(k pulumi.StringInput) FileStoreFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FileStoreFile {
		return vs[0].(map[string]*FileStoreFile)[vs[1].(string)]
	}).(FileStoreFileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileStoreFileInput)(nil)).Elem(), &FileStoreFile{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileStoreFileArrayInput)(nil)).Elem(), FileStoreFileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileStoreFileMapInput)(nil)).Elem(), FileStoreFileMap{})
	pulumi.RegisterOutputType(FileStoreFileOutput{})
	pulumi.RegisterOutputType(FileStoreFileArrayOutput{})
	pulumi.RegisterOutputType(FileStoreFileMapOutput{})
}
