# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations
from ....core.pydantic_utilities import UniversalBaseModel
import typing
from .multiple_filter_search_request_operator import MultipleFilterSearchRequestOperator
from ....core.pydantic_utilities import IS_PYDANTIC_V2
import pydantic
from ....core.pydantic_utilities import update_forward_refs
class MultipleFilterSearchRequest(UniversalBaseModel):
    operator: typing.Optional[MultipleFilterSearchRequestOperator] = None
    value: typing.Optional["MultipleFilterSearchRequestValue"] = None
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
from .multiple_filter_search_request_value import MultipleFilterSearchRequestValue # noqa: E402, F401, I001
update_forward_refs(MultipleFilterSearchRequest)
