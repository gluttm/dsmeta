import axios from 'axios'
import { toast } from 'react-toastify'
import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request'
import './styles.css'

type Props = {
  saleId: number
}
const NotificationButton = ({ saleId }: Props) => {

  const handleClick = (id: number) => {
    axios.get(`${BASE_URL}/api/v1/sales/${id}/notification`)
      .then(resp => {
        toast.info("SMS enviada com sucesso!")
      })
  }

  return (
    <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton