# This file was auto-generated by Fern from our API Definition.

import typing
from .single_filter_search_request import SingleFilterSearchRequest
from .multiple_filter_search_request import MultipleFilterSearchRequest
SearchRequestQuery = typing.Union[SingleFilterSearchRequest, MultipleFilterSearchRequest]
