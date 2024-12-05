package com.example.demo

/**
 * · name(String): 제품의 이름
 * · price(Double): 제품의 가격
 * · quantity(Int): 제품의 처음 수량
 * quantity 프로퍼티에 음수가 입력되면 0으로 설정하는 커스텀 세터를 구현하 세요.
 * 제품의 전체 가격을 반환하는 calculateTotalValue 메서드를 추가하세요.
 * 입력한 양만큼 제품의 수량을 증가시키는 restock 메서드를 구현하세요. 음 수를 건네면 아무 일도 하지 않아야 합니다.
 * 다음 지침을 따르세요.
 * 1. 주 생성자에서 name, price, quantity 프로퍼티를 정의하는 형태로 Product 클래스를 정의하세요.
 * 2. quantity프로퍼티의커스텀세터를구현하세요.
 * 3. 전체 가격을 계산하고 반환하는 calculateTotalValue 메서드를 구현하
 * 세요.
 * 4. 수량을증가시키는restock메서드를구현하세요.
 * 5. Procuct 클래스의 인스턴스를 만들고 메서드들을 호출해 보며 정확하게 구
 * 현했는지 테스트하세요.
 *
 */
class Product(val name: String, val price: Double, initialQuantity: Int) {
    var quantity: Int = initialQuantity
        set(quantityParam) {
           field = if(quantityParam < 0) 0 else quantityParam
        }

    fun calculateTotalValue() : Double {
        return quantity * price
    }

    fun restock(addQuantity: Int) {
        if(addQuantity > 0)
            this.quantity += addQuantity
    }
}