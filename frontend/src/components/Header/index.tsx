import logo from '../../assets/img/logo.svg'
import './styles.css'

const Header = () => {

  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>
          Desenvolvido por
          <a href="https://www.truetech.co.mz"> glu@truetech.co.mz</a>
        </p>
      </div>
    </header>
  )
}

export default Header