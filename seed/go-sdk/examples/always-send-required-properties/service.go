// Code generated by Fern. DO NOT EDIT.

package examples

type GetMetadataRequest struct {
	XApiVersion string    `json:"-" url:"-"`
	Shallow     *bool     `json:"-" url:"shallow,omitempty"`
	Tag         []*string `json:"-" url:"tag,omitempty"`
}
