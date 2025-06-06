# This file was auto-generated by Fern from our API Definition.

from ....core.pydantic_utilities import UniversalBaseModel
import pydantic
from ....core.pydantic_utilities import IS_PYDANTIC_V2
import typing
class WorkspaceTracedUpdate(UniversalBaseModel):
    trace_responses_size: int = pydantic.Field(alias="traceResponsesSize")
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
