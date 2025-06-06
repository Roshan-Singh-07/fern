# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations

import typing

import pydantic
from ...core.pydantic_utilities import IS_PYDANTIC_V2, UniversalBaseModel, update_forward_refs
from ..commons.language import Language
from ..commons.problem_id import ProblemId
from ..commons.test_case_with_expected_result import TestCaseWithExpectedResult
from .problem_description import ProblemDescription
from .problem_files import ProblemFiles
from .variable_type_and_name import VariableTypeAndName


class ProblemInfo(UniversalBaseModel):
    problem_id: ProblemId = pydantic.Field(alias="problemId")
    problem_description: ProblemDescription = pydantic.Field(alias="problemDescription")
    problem_name: str = pydantic.Field(alias="problemName")
    problem_version: int = pydantic.Field(alias="problemVersion")
    files: typing.Dict[Language, ProblemFiles]
    input_params: typing.List[VariableTypeAndName] = pydantic.Field(alias="inputParams")
    output_type: "VariableType" = pydantic.Field(alias="outputType")
    testcases: typing.List[TestCaseWithExpectedResult]
    method_name: str = pydantic.Field(alias="methodName")
    supports_custom_test_cases: bool = pydantic.Field(alias="supportsCustomTestCases")

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow")  # type: ignore # Pydantic v2
    else:

        class Config:
            extra = pydantic.Extra.allow


from ..commons.key_value_pair import KeyValuePair  # noqa: E402, F401, I001
from ..commons.map_value import MapValue  # noqa: E402, F401, I001
from ..commons.list_type import ListType  # noqa: E402, F401, I001
from ..commons.map_type import MapType  # noqa: E402, F401, I001
from ..commons.variable_type import VariableType  # noqa: E402, F401, I001

update_forward_refs(ProblemInfo)
