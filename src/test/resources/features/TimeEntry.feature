@TimeEntry @Smoke
Feature: Time Entry

  Scenario Outline: Consultar horas registradas exitosamente
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And un id_WSpace
    And un userId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity     | jsonName         | status |
      | GET       | TIME_ENTRY | time/rq_get_time | 200    |


  Scenario Outline: Agregar horas a un proyectos exitosamente
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And un id_WSpace
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity         | jsonName          | status |
      | POST      | ADD_TIME_ENTRY | time/rq_post_time | 201    |


  Scenario Outline:  Editar un campo de un registro de horas exitosamente
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And un id_WSpace
    And un id del registro de horas
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity          | jsonName         | status |
      | PUT       | EDIT_TIME_ENTRY | time/rq_put_time | 200    |


  Scenario Outline: Eliminar horas registradas exitosamente
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And un id_WSpace
    And un id del registro de horas
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity            | jsonName            | status |
      | DELETE    | DELETE_TIME_ENTRY | time/rq_delete_time | 204    |

