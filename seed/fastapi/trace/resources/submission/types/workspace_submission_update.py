# This file was auto-generated by Fern from our API Definition.

from ....core.pydantic_utilities import UniversalBaseModel
import datetime as dt
import pydantic
from .workspace_submission_update_info import WorkspaceSubmissionUpdateInfo
from ....core.pydantic_utilities import IS_PYDANTIC_V2
import typing
class WorkspaceSubmissionUpdate(UniversalBaseModel):
    update_time: dt.datetime = pydantic.Field(alias="updateTime")
    update_info: WorkspaceSubmissionUpdateInfo = pydantic.Field(alias="updateInfo")
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
