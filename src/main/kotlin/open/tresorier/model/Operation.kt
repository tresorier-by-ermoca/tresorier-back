package open.tresorier.model

class Operation (
        var accountId: String,
        var day: Day,
        var categoryId: String? = null,
        var amount: Int = 0,    // cents
        var orderInDay: Long,
        var memo: String? = null,
        var pending: Boolean = false,
        var locked: Boolean,
        var motherOperation: String? = null,
        id: String? = null,
        deleted: Boolean? = null
) : DbObject(id, deleted) {
        fun isEquals(operation: Operation): Boolean {
               if (!operation.day.isEquals(this.day)) {
                        return false
                }
                if (operation.amount != this.amount) {
                        return false
                }
                if (operation.categoryId != this.categoryId) {
                        return false
                }
                if (!operation.memo.equals(this.memo)) {
                        return false
                }
                return true
        }
}
