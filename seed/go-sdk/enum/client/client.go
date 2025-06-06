// Code generated by Fern. DO NOT EDIT.

package client

import (
	core "github.com/enum/fern/core"
	inlinedrequest "github.com/enum/fern/inlinedrequest"
	internal "github.com/enum/fern/internal"
	option "github.com/enum/fern/option"
	pathparam "github.com/enum/fern/pathparam"
	queryparam "github.com/enum/fern/queryparam"
	http "net/http"
)

type Client struct {
	baseURL string
	caller  *internal.Caller
	header  http.Header

	InlinedRequest *inlinedrequest.Client
	PathParam      *pathparam.Client
	QueryParam     *queryparam.Client
}

func NewClient(opts ...option.RequestOption) *Client {
	options := core.NewRequestOptions(opts...)
	return &Client{
		baseURL: options.BaseURL,
		caller: internal.NewCaller(
			&internal.CallerParams{
				Client:      options.HTTPClient,
				MaxAttempts: options.MaxAttempts,
			},
		),
		header:         options.ToHeader(),
		InlinedRequest: inlinedrequest.NewClient(opts...),
		PathParam:      pathparam.NewClient(opts...),
		QueryParam:     queryparam.NewClient(opts...),
	}
}
